package com.xoxoer.epict.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/xoxoer/epict/interfaces/EpictContract;", "", "retract", "", "setAbsolutePath", "absolutePath", "", "setFile", "file", "Ljava/io/File;", "upload", "epictlibrary_debug"})
public abstract interface EpictContract {
    
    public abstract void setFile(@org.jetbrains.annotations.NotNull()
    java.io.File file);
    
    public abstract void setAbsolutePath(@org.jetbrains.annotations.NotNull()
    java.lang.String absolutePath);
    
    public abstract void upload();
    
    public abstract void retract();
}