package com.xoxoer.epictlibrary.utils

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import com.xoxoer.epictlibrary.enums.ImageShape
import com.xoxoer.epictlibrary.model.EpictData
import com.xoxoer.epictlibrary.model.EpictViews
import java.io.File

// file provider
fun EpictData?.fileProvider(context: Context, file: File): Uri {
    var uri: Uri? = null
    if (this != null) {
        uri = FileProvider.getUriForFile(context, this.authority, file)
    }
    return uri!!
}

// load image locally or result from api
fun Pair<EpictViews?, EpictData?>.loadImage(uri: String) {
    this.first?.imageView?.apply {
        when (this@loadImage.second?.imageShape) {
            ImageShape.SQUARE -> load(uri)
            ImageShape.CIRCLE -> circle(uri)
        }
    }
}

// clear image from image view
fun EpictViews?.clearImage(uri: String) {
    this?.imageView?.clearImage()
}