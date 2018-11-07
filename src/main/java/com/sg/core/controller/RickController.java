package com.sg.core.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

@Controller
@RequestMapping(value = "/rick")
public class RickController {

    @GetMapping
    public ResponseEntity<byte[]> getRick() throws IOException {
        ClassLoader loader = RickController.class.getClassLoader();
        File gif = new File(Objects.requireNonNull(loader.getResource("media/rick.gif")).getFile());

        return ResponseEntity.ok().contentType(MediaType.IMAGE_GIF)
                .body(Files.readAllBytes(gif.toPath()));
    }
}
