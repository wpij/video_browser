package com.example.videos;

public class Video {
    private String videoName;
    private String videoUrl;

    public Video(){}

    public Video(String videoName, String videoUrl) {
        this.videoName = videoName;
        this.videoUrl = videoUrl;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }


}
