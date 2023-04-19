package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TutorialController {
    @GetMapping("/tutorial")
    public List<String> getInformations(){
        List<String> list = new ArrayList<String>();
        list.add("info1");
        list.add("info2");
        list.add("info3");
        return list;
    }
}
