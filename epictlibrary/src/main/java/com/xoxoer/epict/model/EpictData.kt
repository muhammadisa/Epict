package com.xoxoer.epictlibrary.model

import com.xoxoer.epictlibrary.enums.ImageShape

data class EpictData (
    val title: String,
    val subtitle: String,
    val authority: String,
    val imageShape: ImageShape
)