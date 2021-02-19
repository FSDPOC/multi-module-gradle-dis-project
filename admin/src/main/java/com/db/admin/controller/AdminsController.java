//
package com.db.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adminapp")
public class AdminsController {
    String asdsad = new String();
    // String asdsad = new String();

    @Autowired MessageSource messageSource;

    @GetMapping("/admin")
    public ResponseEntity getAdmin() {
        return ResponseEntity.ok("Admin service module is active");
    }
}
/*

public class AdminController {
	public static void main(String[] args) {
		System.out.println("admin main entered");
	}
}*/
