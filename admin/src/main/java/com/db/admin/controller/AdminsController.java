//
package com.db.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adminapp")
@Api(value = "Admin Controller")
public class AdminsController {

    @Autowired MessageSource messageSource;

    @GetMapping("/admin")
    @ApiOperation(value = "test admin path", notes = "testing admin module controller")
    public ResponseEntity getAdmin() {
        return ResponseEntity.ok("Admin service module is active");
    }
}
