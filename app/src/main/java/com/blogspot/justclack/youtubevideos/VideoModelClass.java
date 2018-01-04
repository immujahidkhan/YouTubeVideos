package com.blogspot.justclack.youtubevideos;

/**
 * Created by mujahidkhan on 1/5/18.
 */

public class VideoModelClass {
    String videoUrl;
    public VideoModelClass() {
    }

    public VideoModelClass(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
