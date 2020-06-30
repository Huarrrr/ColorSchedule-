package top.huar.schedule.util;

import java.lang.System;

/**
 * https://github.com/zhihu/Matisse/blob/master/sample/src/main/java/com/zhihu/matisse/sample/Glide4Engine.java
 * [ImageEngine] implementation using Glide.
 *
 * @author zhihu
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016\u00a8\u0006\u0016"}, d2 = {"Ltop/huar/schedule/util/Glide4Engine;", "Lcom/zhihu/matisse/engine/ImageEngine;", "()V", "loadGifImage", "", "context", "Landroid/content/Context;", "resizeX", "", "resizeY", "imageView", "Landroid/widget/ImageView;", "uri", "Landroid/net/Uri;", "loadGifThumbnail", "resize", "placeholder", "Landroid/graphics/drawable/Drawable;", "loadImage", "loadThumbnail", "supportAnimatedGif", "", "app_debug"})
public final class Glide4Engine implements com.zhihu.matisse.engine.ImageEngine {
    
    @java.lang.Override()
    public void loadThumbnail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resize, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable placeholder, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void loadGifThumbnail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resize, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable placeholder, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void loadImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resizeX, int resizeY, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void loadGifImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resizeX, int resizeY, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public boolean supportAnimatedGif() {
        return false;
    }
    
    public Glide4Engine() {
        super();
    }
}