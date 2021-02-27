package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class ApplicationController {

    @Autowired MessageSource messageSource;

    @GetMapping("/admin")
    public ResponseEntity getAdmin() {
        return ResponseEntity.ok("Admin service module is active");
    }
}
