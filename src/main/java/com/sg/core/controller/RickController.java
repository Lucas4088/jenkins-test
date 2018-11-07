package com.sg.core.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController(value = "/rick")
public class RickController {

    @GetMapping
    public ResponseEntity<byte[]> getRick() throws IOException {
        File gif = new File("src/main/resources/media/rick.gif");

        return ResponseEntity.ok().contentType(MediaType.IMAGE_GIF)
                .body(Files.readAllBytes(gif.toPath()));
    }
}
