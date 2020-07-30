package com.xoxoer.epictlibrary

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.xoxoer.epictlibrary.constant.Constants.CAMERA_REQUEST_CODE
import com.xoxoer.epictlibrary.constant.Constants.GALLERY_REQUEST_CODE
import com.xoxoer.epictlibrary.exceptions.ICEContractInterfaceNotValid
import com.xoxoer.epictlibrary.interfaces.EpictContract
import com.xoxoer.epictlibrary.interfaces.EpictViewModelContract
import com.xoxoer.epictlibrary.model.EpictData
import com.xoxoer.epictlibrary.model.EpictViews
import com.xoxoer.epictlibrary.utils.clearImageWithPlaceholder
import com.xoxoer.epictlibrary.utils.createImage
import com.xoxoer.epictlibrary.utils.fileProvider
import com.xoxoer.epictlibrary.utils.loadImage
import java.io.File
import java.io.IOException

class Epict private constructor(
    private val context: Context?,
    private val epictData: EpictData?,
    private val epictViews: EpictViews?,
    private val epictViewModel: ViewModel?
) : EpictContract {

    var fileResult = ObservableField<File>()
    var fileAbsolutePath = ObservableField<String>()

    // builder class
    data class Builder(
        var context: Context? = null,
        var epictData: EpictData? = null,
        var epictViews: EpictViews? = null,
        var epictViewModel: ViewModel? = null
    ) {
        // builder

        // set context
        fun context(context: Context) = apply { this.context = context }

        // set instant camera data
        fun data(epictData: EpictData) = apply { this.epictData = epictData }

        // set instant camera views for set the on click listener
        fun views(epictViews: EpictViews) = apply { this.epictViews = epictViews }

        fun viewModel(epictViewModel: ViewModel) =
            apply { this.epictViewModel = epictViewModel }

        // build all data set
        fun build(): Epict {
            val epict = Epict(context, epictData, epictViews, epictViewModel)
            epict.verifyBeforeAssignOnClickListener()
            return if (epict.epictViewModel != null &&
                epict.epictViewModel is EpictViewModelContract
            ) {
                epict.verifyBeforeAssignObservable()
                epict
            } else if (epict.epictViewModel != null &&
                epict.epictViewModel !is EpictViewModelContract
            ) {
                throw ICEContractInterfaceNotValid(
                    "Please implements EpictViewModelContract in your view model"
                )
            } else {
                epict
            }
        }
    }

    override fun setFile(file: File) {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            epictViewModel.fileToBeUploaded.set(file)
        }
    }

    override fun setAbsolutePath(absolutePath: String) {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            epictViewModel.fileAbsolutePath.set(absolutePath)
        }
    }

    override fun upload() {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            epictViewModel.uploadImageToServer()
        }
    }

    override fun retract() {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            epictViewModel.retractImageFromServer()
        } else {
            epictViews?.imageView?.clearImageWithPlaceholder()
        }
    }

    private fun setImage(file: File, uri: Uri) {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            setFile(file)
            setAbsolutePath(uri.toString())
        } else {
            Pair(epictViews, epictData).loadImage(uri.toString())
            fileResult.set(file)
            fileAbsolutePath.set(uri.toString())
        }
    }

    // verify epictViews and epictData before start camera dialog
    private fun verifyBeforeAssignOnClickListener() {
        if (epictViews != null && epictData != null) {
            epictViews.buttonUpload.setOnClickListener {
                startCameraDialog(epictData.title, epictData.subtitle)
            }
            epictViews.buttonRetract.setOnClickListener {
                retract()
            }
        }
    }

    private fun verifyBeforeAssignObservable() {
        if (epictViewModel != null && epictViewModel is EpictViewModelContract) {
            epictViewModel.uploadedFileUrl.observeForever {
                if (it != null) {
                    Pair(epictViews, epictData).loadImage(it)
                } else {
                    epictViews?.imageView?.clearImageWithPlaceholder()
                }
            }

            epictViewModel.uploadedFileObjectName.observeForever {

            }
        }
    }

    // used for load image from gallery
    fun getRealPathFromURI(contentUri: Uri?): String? {
        var result: String? = null
        val projects = arrayOf(MediaStore.Images.Media.DATA)
        val cursor = context!!.contentResolver.query(
            contentUri!!,
            projects,
            null,
            null,
            null
        )
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                val columnIndex = cursor.getColumnIndexOrThrow(projects[0])
                result = cursor.getString(columnIndex)
            }
            cursor.close()
        }
        val file = File(result!!)
        val uri = epictData?.fileProvider(context, file)
        setImage(file, uri!!)
        return result
    }

    // start camera dialog
    private fun startCameraDialog(title: String, message: String) {
        val builder = AlertDialog.Builder(context)
        builder.apply {
            setTitle(title)
            setMessage(message)
            setNegativeButton("Gallery", DialogInterface.OnClickListener(openGalleryActivity))
            setPositiveButton("Camera", DialogInterface.OnClickListener(openCameraActivity))
            setNeutralButton("Cancel", DialogInterface.OnClickListener(openCancelled))
            show()
        }
    }

    // open cancelled handler
    // used for handle cancellation from user
    // while choosing pick from gallery or from camera
    private val openCancelled = { _: DialogInterface, _: Int ->
        Toast.makeText(context, "Canceled by user", Toast.LENGTH_SHORT).show()
    }

    // open gallery activity
    // used for handle pick picture from gallery
    private val openGalleryActivity = { _: DialogInterface, _: Int ->
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        (context as Activity).startActivityForResult(
            Intent.createChooser(
                intent, "Choose Image"
            ), GALLERY_REQUEST_CODE
        )
    }

    // open camera activity
    // used for handle pick picture from camera
    private val openCameraActivity = { _: DialogInterface, _: Int ->
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (intent.resolveActivity(context!!.packageManager) != null) {
            var photoFile: File? = null
            try {
                photoFile = context.createImage()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            if (photoFile != null) {
                val photoUri = epictData.fileProvider(context, photoFile)
                intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri)
                setImage(photoFile, photoUri)
                (context as Activity).startActivityForResult(intent, CAMERA_REQUEST_CODE)
            }
        }
    }

}