package com.xoxoer.epict

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xoxoer.epictlibrary.Epict
import com.xoxoer.epictlibrary.constant.Constants.CAMERA_REQUEST_CODE
import com.xoxoer.epictlibrary.constant.Constants.GALLERY_REQUEST_CODE
import com.xoxoer.epictlibrary.enums.ImageShape
import com.xoxoer.epictlibrary.model.EpictData
import com.xoxoer.epictlibrary.model.EpictViews
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var epict: Epict

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = EpictData(
            "Choose",
            "Take photo profile from?",
            "com.xoxo.mnp.fileprovider",
            ImageShape.CIRCLE
        )
        val views = EpictViews(
            image_view_result,
            button_upload,
            button_retract
        )
        epict = Epict.Builder()
            .context(this) // required
//            .viewModel(PhotoUploaderViewModel()) // optional
            .data(data) // required
            .views(views) // required
            .build()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from camera
                epict.upload()
            }
            GALLERY_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from gallery
                epict.getRealPathFromURI(data?.data)
                epict.upload()
            }
        }
    }
}