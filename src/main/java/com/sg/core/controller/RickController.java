package com.sg.core.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

@Controller
@RequestMapping(value = "/rick")
public class RickController {

    private final ServletContext servletContext;

    public RickController(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @GetMapping
    public String getRick() throws IOException {

        return "RICK!!!!!!!!!!";
    }
}
