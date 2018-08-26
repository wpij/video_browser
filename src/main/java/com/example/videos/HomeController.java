package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;



@Controller
public class HomeController {

    private VideoList videoList = new VideoList();

    @GetMapping("/")
    public String hello() {
        return "hello";
    }


    @GetMapping("/video")
    public String video() {
        return "video";
    }



    @GetMapping("/add")
        public String create(
            @RequestParam String videoname,
            @RequestParam String video_url,
            ModelMap modelMap) {

        Video video = new Video(videoname,video_url);
        videoList.addvideo(video);
        System.out.println("Videos size"+videoList.findAll().size());
        modelMap.put("videos",videoList.findAll());
        return "list";
    }


    @ResponseBody
    @GetMapping("/list")
    public String all(ModelMap map){
        map.put("videos",videoList.findAll());
       return "play";
    }

    @Override
    public String toString() {
        return "HomeController{" +
                "videoList=" + videoList +
                '}';
    }
}