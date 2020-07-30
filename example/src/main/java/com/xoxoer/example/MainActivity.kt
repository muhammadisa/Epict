package com.xoxoer.example

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xoxoer.epict.Epict
import com.xoxoer.epict.constant.Constants.CAMERA_REQUEST_CODE
import com.xoxoer.epict.constant.Constants.GALLERY_REQUEST_CODE
import com.xoxoer.epict.enums.ImageShape
import com.xoxoer.epict.model.EpictData
import com.xoxoer.epict.model.EpictViews
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    // epict lateinit var
    private lateinit var epict: Epict

    // non-MVVM project
    private lateinit var file: File
    private lateinit var absoluteFile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
            // viewModel is only worked with MVVM architecture
            // if your project architecture is not MVVM you can't
            // use viewModel
            .viewModel(PhotoUploaderViewModel()) // optional
            .data(data) // required
            .views(views) // required
            .build()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from camera

                // MVVM project
                epict.upload()

                // non-MVVM project
                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
            }
            GALLERY_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from gallery
                epict.getRealPathFromURI(data?.data)

                // MVVM project
                epict.upload()

                // non-MVVM project
                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
            }
        }
    }
}