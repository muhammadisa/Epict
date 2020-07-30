package com.xoxoer.epict.model

import com.xoxoer.epict.enums.ImageShape

data class EpictData (
    val title: String,
    val subtitle: String,
    val authority: String,
    val imageShape: ImageShape
)