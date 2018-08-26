package com.example.videos;

import java.util.ArrayList;
import java.util.List;

//to jest StaticDao


public class VideoList implements VideoDao{

    private static List<Video> videoList = new ArrayList<>();

    @Override
    public List<Video> findAll() {
        return videoList;
    }

    @Override
    public void addvideo(Video video) {
        videoList.add(video);
    }

    public static List<Video> getVideoList() {
        return videoList;
    }
}
