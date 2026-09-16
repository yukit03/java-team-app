package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.Yuk1t04Service;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TeamController {
	
	private final Yuk1t04Service yuk1t04service;
	
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
        model.addAttribute("yuk1t04", yuk1t04service.getProfile());
        return "index";
    }
}