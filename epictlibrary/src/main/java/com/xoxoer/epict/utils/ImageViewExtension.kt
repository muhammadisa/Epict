package com.xoxoer.epict.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.xoxoer.epict.R

fun ImageView.load(imgUri: Any) {
    Glide.with(context)
        .load(imgUri)
        .apply(RequestOptions())
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this)
}

fun ImageView.circle(imageUri: Any) {
    Glide.with(context)
        .asBitmap()
        .load(imageUri)
        .apply(RequestOptions().transform(CircleCrop()))
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this)
}

fun ImageView.clearImage() {
    this.setImageDrawable(null)
}

fun ImageView.clearImageWithPlaceholder() {
    this.setImageResource(R.drawable.image_placeholder)
}