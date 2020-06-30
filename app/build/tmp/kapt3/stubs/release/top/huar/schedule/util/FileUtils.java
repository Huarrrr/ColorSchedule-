package top.huar.schedule.util;

import java.lang.System;

/**
 * 文件工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0003J\u0014\u0010\u0010\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ltop/huar/schedule/util/FileUtils;", "", "()V", "MAX_IMAGE_FILE_SIZE", "", "TAG", "", "transferFile", "", "context", "Landroid/content/Context;", "fromUri", "Landroid/net/Uri;", "fileName", "writeFile2Cache", "", "toFile", "Ljava/io/InputStream;", "path", "app_release"})
public final class FileUtils {
    private static final java.lang.String TAG = "FileUtils";
    private static final int MAX_IMAGE_FILE_SIZE = 20;
    public static final top.huar.schedule.util.FileUtils INSTANCE = null;
    
    public final void transferFile(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.net.Uri fromUri, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String fileName) {
    }
    
    @androidx.annotation.CheckResult()
    private final boolean writeFile2Cache(@androidx.annotation.NonNull()
    android.content.Context context, @androidx.annotation.NonNull()
    android.net.Uri fromUri) {
        return false;
    }
    
    private final void toFile(@org.jetbrains.annotations.NotNull()
    java.io.InputStream $this$toFile, java.lang.String path) {
    }
    
    private FileUtils() {
        super();
    }
}