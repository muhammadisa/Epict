package com.xoxoer.epict.interfaces

import java.io.File

interface EpictContract {
    fun setFile(file: File)
    fun setAbsolutePath(absolutePath: String)
    fun upload()
    fun retract()
}