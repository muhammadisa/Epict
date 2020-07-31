package com.xoxoer.example

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xoxoer.epict.interfaces.EpictViewModelContract
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File

class PhotoUploaderViewModel : ViewModel(), EpictViewModelContract {

    override var fileAbsolutePath = ObservableField<String>()
    override var fileToBeUploaded = ObservableField<File>()
    override var uploadedFileObjectName = MutableLiveData<String>()
    override var uploadedFileUrl = MutableLiveData<String>()

    override fun uploadImageToServer() {
        GlobalScope.launch {
            // delay used for pretend like uploading image to server
            delay(1000)
            uploadedFileUrl.postValue(fileAbsolutePath.get())
            uploadedFileObjectName.postValue(fileToBeUploaded.get()?.name)
        }
    }

    override fun retractImageFromServer() {
        GlobalScope.launch {
            // delay used for pretend like retracting image from server
            delay(1000)
            uploadedFileUrl.postValue(null)
            uploadedFileObjectName.postValue(null)
        }
    }

}