package com.sg.core.controller;

import com.sg.core.Sandbox;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/sandbox")
public class SandboxController {

    private final Sandbox sandbox;

    public SandboxController(Sandbox sandbox) {
        this.sandbox = sandbox;
    }

    @GetMapping
    public ResponseEntity<String> sayHi() {
        System.out.println(sandbox.evaluateParity(100));
        return ResponseEntity.ok().body("Hi user");
    }
}
