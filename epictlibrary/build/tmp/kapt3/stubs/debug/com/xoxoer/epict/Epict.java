package com.xoxoer.epict;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001-B/\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001fH\u0002J\u0018\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0002J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/xoxoer/epict/Epict;", "Lcom/xoxoer/epict/interfaces/EpictContract;", "context", "Landroid/content/Context;", "epictData", "Lcom/xoxoer/epict/model/EpictData;", "epictViews", "Lcom/xoxoer/epict/model/EpictViews;", "epictViewModel", "Landroidx/lifecycle/ViewModel;", "(Landroid/content/Context;Lcom/xoxoer/epict/model/EpictData;Lcom/xoxoer/epict/model/EpictViews;Landroidx/lifecycle/ViewModel;)V", "fileAbsolutePath", "Landroidx/databinding/ObservableField;", "", "getFileAbsolutePath", "()Landroidx/databinding/ObservableField;", "setFileAbsolutePath", "(Landroidx/databinding/ObservableField;)V", "fileResult", "Ljava/io/File;", "getFileResult", "setFileResult", "openCameraActivity", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "", "openCancelled", "openGalleryActivity", "getRealPathFromURI", "contentUri", "Landroid/net/Uri;", "retract", "setAbsolutePath", "absolutePath", "setFile", "file", "setImage", "uri", "startCameraDialog", "title", "message", "upload", "verifyBeforeAssignObservable", "verifyBeforeAssignOnClickListener", "Builder", "epictlibrary_debug"})
public final class Epict implements com.xoxoer.epict.interfaces.EpictContract {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.io.File> fileResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> fileAbsolutePath;
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> openCancelled = null;
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> openGalleryActivity = null;
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> openCameraActivity = null;
    private final android.content.Context context = null;
    private final com.xoxoer.epict.model.EpictData epictData = null;
    private final com.xoxoer.epict.model.EpictViews epictViews = null;
    private final androidx.lifecycle.ViewModel epictViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.io.File> getFileResult() {
        return null;
    }
    
    public final void setFileResult(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.io.File> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFileAbsolutePath() {
        return null;
    }
    
    public final void setFileAbsolutePath(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void setFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    @java.lang.Override()
    public void setAbsolutePath(@org.jetbrains.annotations.NotNull()
    java.lang.String absolutePath) {
    }
    
    @java.lang.Override()
    public void upload() {
    }
    
    @java.lang.Override()
    public void retract() {
    }
    
    private final void setImage(java.io.File file, android.net.Uri uri) {
    }
    
    private final void verifyBeforeAssignOnClickListener() {
    }
    
    private final void verifyBeforeAssignObservable() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.Nullable()
    android.net.Uri contentUri) {
        return null;
    }
    
    private final void startCameraDialog(java.lang.String title, java.lang.String message) {
    }
    
    private Epict(android.content.Context context, com.xoxoer.epict.model.EpictData epictData, com.xoxoer.epict.model.EpictViews epictViews, androidx.lifecycle.ViewModel epictViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J9\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/xoxoer/epict/Epict$Builder;", "", "context", "Landroid/content/Context;", "epictData", "Lcom/xoxoer/epict/model/EpictData;", "epictViews", "Lcom/xoxoer/epict/model/EpictViews;", "epictViewModel", "Landroidx/lifecycle/ViewModel;", "(Landroid/content/Context;Lcom/xoxoer/epict/model/EpictData;Lcom/xoxoer/epict/model/EpictViews;Landroidx/lifecycle/ViewModel;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getEpictData", "()Lcom/xoxoer/epict/model/EpictData;", "setEpictData", "(Lcom/xoxoer/epict/model/EpictData;)V", "getEpictViewModel", "()Landroidx/lifecycle/ViewModel;", "setEpictViewModel", "(Landroidx/lifecycle/ViewModel;)V", "getEpictViews", "()Lcom/xoxoer/epict/model/EpictViews;", "setEpictViews", "(Lcom/xoxoer/epict/model/EpictViews;)V", "build", "Lcom/xoxoer/epict/Epict;", "component1", "component2", "component3", "component4", "copy", "data", "equals", "", "other", "hashCode", "", "toString", "", "viewModel", "views", "epictlibrary_debug"})
    public static final class Builder {
        @org.jetbrains.annotations.Nullable()
        private android.content.Context context;
        @org.jetbrains.annotations.Nullable()
        private com.xoxoer.epict.model.EpictData epictData;
        @org.jetbrains.annotations.Nullable()
        private com.xoxoer.epict.model.EpictViews epictViews;
        @org.jetbrains.annotations.Nullable()
        private androidx.lifecycle.ViewModel epictViewModel;
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict.Builder data(@org.jetbrains.annotations.NotNull()
        com.xoxoer.epict.model.EpictData epictData) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict.Builder views(@org.jetbrains.annotations.NotNull()
        com.xoxoer.epict.model.EpictViews epictViews) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict.Builder viewModel(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModel epictViewModel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict build() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.xoxoer.epict.model.EpictData getEpictData() {
            return null;
        }
        
        public final void setEpictData(@org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictData p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.xoxoer.epict.model.EpictViews getEpictViews() {
            return null;
        }
        
        public final void setEpictViews(@org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictViews p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.ViewModel getEpictViewModel() {
            return null;
        }
        
        public final void setEpictViewModel(@org.jetbrains.annotations.Nullable()
        androidx.lifecycle.ViewModel p0) {
        }
        
        public Builder(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictData epictData, @org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictViews epictViews, @org.jetbrains.annotations.Nullable()
        androidx.lifecycle.ViewModel epictViewModel) {
            super();
        }
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.xoxoer.epict.model.EpictData component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.xoxoer.epict.model.EpictViews component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.ViewModel component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.xoxoer.epict.Epict.Builder copy(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictData epictData, @org.jetbrains.annotations.Nullable()
        com.xoxoer.epict.model.EpictViews epictViews, @org.jetbrains.annotations.Nullable()
        androidx.lifecycle.ViewModel epictViewModel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}