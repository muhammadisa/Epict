package com.xoxoer.epictlibrary.interfaces

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import java.io.File

interface EpictViewModelContract {

    // abstract variables
    var fileAbsolutePath: ObservableField<String>
    var fileToBeUploaded: ObservableField<File>
    var uploadedFileObjectName: MutableLiveData<String>
    var uploadedFileUrl: MutableLiveData<String>

    // abstract functions
    fun uploadImageToServer()
    fun retractImageFromServer()

}