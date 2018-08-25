package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/video")
    public String video() {
        return "video";

    }
}