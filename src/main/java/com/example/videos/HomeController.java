package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private VideoList videoList = new VideoList();

    @GetMapping("/")
    public String hello() {
        return "hello";
    }


    @GetMapping("/video_add")
        public String create(
            @RequestParam String videoname,
            @RequestParam String video_url,
            ModelMap modelMap) {

        Video video = new Video(videoname,video_url);
        modelMap.put("video",video);
        videoList.addvideo(video);
        return "/list";
    }


    @GetMapping("/video")
    public String video() {
        return "list";
    }

    @ResponseBody
    @GetMapping("/list")
    public String all(ModelMap map){
        map.put("videos",videoList.findAll());
       return "play";
    }


}