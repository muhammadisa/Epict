package com.xoxoer.example

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
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

    // for store file and absolute path file
    private lateinit var file: File
    private lateinit var absoluteFile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_navigate_version.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainMvvmActivity::class.java))
        }

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
            .data(data) // required
            .views(views) // required
            .build()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from camera
                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
                text_view_file_absolute.text = "Absolute Path : ${file.absolutePath}"
                text_view_image_uri.text = "URI : $absoluteFile"
                Log.e("FILE", file.absolutePath)
                Log.e("ABSOLUTE", absoluteFile)
            }
            GALLERY_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from gallery
                epict.getRealPathFromURI(data?.data)

                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
                text_view_file_absolute.text = "Absolute Path : ${file.absolutePath}"
                text_view_image_uri.text = "URI : $absoluteFile"
                Log.e("FILE", file.absolutePath)
                Log.e("ABSOLUTE", absoluteFile)
            }
        }
    }
}