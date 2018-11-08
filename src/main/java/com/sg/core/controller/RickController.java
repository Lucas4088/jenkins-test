package com.sg.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/rick")
public class RickController {


    @GetMapping
    public String getRick(){

        return "RICK!!!!!!!!!!";
    }
}
