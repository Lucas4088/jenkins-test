package com.sg.core.controller;

import com.sg.core.Sandbox;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/sanbox")
public class SandboxController {

    private final Sandbox sandbox;

    public SandboxController(Sandbox sandbox) {
        this.sandbox = sandbox;
    }

    @GetMapping
    public String sayHi() {
        System.out.println(sandbox.evaluateParity(100));
        return "Hi user";
    }
}
