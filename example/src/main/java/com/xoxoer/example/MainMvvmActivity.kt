package com.xoxoer.example

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.xoxoer.epict.Epict
import com.xoxoer.epict.constant.Constants
import com.xoxoer.epict.enums.ImageShape
import com.xoxoer.epict.model.EpictData
import com.xoxoer.epict.model.EpictViews
import kotlinx.android.synthetic.main.activity_main.*

class MainMvvmActivity : AppCompatActivity() {

    // epict lateinit var
    private lateinit var epict: Epict

    private lateinit var photoUploaderViewModel: PhotoUploaderViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvvm)

        button_navigate_version.setOnClickListener {
            startActivity(Intent(this@MainMvvmActivity, MainActivity::class.java))
        }

        photoUploaderViewModel = PhotoUploaderViewModel()

        val data = EpictData(
            "Choose",
            "Take photo profile from?",
            "com.xoxoer.example.fileprovider",
            ImageShape.CIRCLE
        )
        val views = EpictViews(
            image_view_result,
            button_upload,
            button_retract
        )
        epict = Epict.Builder()
            .context(this) // required
            .viewModel(photoUploaderViewModel)
            .data(data) // required
            .views(views) // required
            .build()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            Constants.CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from camera
                epict.upload()

                text_view_file_absolute.text =
                    "Absolute Path : ${photoUploaderViewModel.fileToBeUploaded.get()!!.absolutePath}"
                text_view_image_uri.text =
                    "URI : ${photoUploaderViewModel.fileAbsolutePath.get()!!}"
                Log.e("FILE", photoUploaderViewModel.fileToBeUploaded.get()!!.absolutePath)
                Log.e("ABSOLUTE", photoUploaderViewModel.fileAbsolutePath.get()!!)
            }
            Constants.GALLERY_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from gallery
                epict.getRealPathFromURI(data?.data)
                epict.upload()

                text_view_file_absolute.text =
                    "Absolute Path : ${photoUploaderViewModel.fileToBeUploaded.get()!!.absolutePath}"
                text_view_image_uri.text =
                    "URI : ${photoUploaderViewModel.fileAbsolutePath.get()!!}"
                Log.e("FILE", photoUploaderViewModel.fileToBeUploaded.get()!!.absolutePath)
                Log.e("ABSOLUTE", photoUploaderViewModel.fileAbsolutePath.get()!!)
            }
        }
    }
}