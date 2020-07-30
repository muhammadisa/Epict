package com.xoxoer.epict.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/xoxoer/epict/interfaces/EpictViewModelContract;", "", "fileAbsolutePath", "Landroidx/databinding/ObservableField;", "", "getFileAbsolutePath", "()Landroidx/databinding/ObservableField;", "setFileAbsolutePath", "(Landroidx/databinding/ObservableField;)V", "fileToBeUploaded", "Ljava/io/File;", "getFileToBeUploaded", "setFileToBeUploaded", "uploadedFileObjectName", "Landroidx/lifecycle/MutableLiveData;", "getUploadedFileObjectName", "()Landroidx/lifecycle/MutableLiveData;", "setUploadedFileObjectName", "(Landroidx/lifecycle/MutableLiveData;)V", "uploadedFileUrl", "getUploadedFileUrl", "setUploadedFileUrl", "retractImageFromServer", "", "uploadImageToServer", "epictlibrary_debug"})
public abstract interface EpictViewModelContract {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ObservableField<java.lang.String> getFileAbsolutePath();
    
    public abstract void setFileAbsolutePath(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ObservableField<java.io.File> getFileToBeUploaded();
    
    public abstract void setFileToBeUploaded(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.io.File> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getUploadedFileObjectName();
    
    public abstract void setUploadedFileObjectName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getUploadedFileUrl();
    
    public abstract void setUploadedFileUrl(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0);
    
    public abstract void uploadImageToServer();
    
    public abstract void retractImageFromServer();
}