package com.xoxoer.epict.utils

import android.content.Context
import android.os.Environment
import java.io.File

// create image for upload
fun Context.createImage(): File {
    val imageName = "img_file"
    val storageDir = this.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
    return File.createTempFile(imageName, ".jpg", storageDir)
}