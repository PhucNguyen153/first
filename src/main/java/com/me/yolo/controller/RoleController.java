package com.me.yolo.controller;

import com.me.yolo.entity.Role;
import com.me.yolo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping
    ResponseEntity<?> create(@RequestBody Role role){
        role = roleService.create(role);
        return new ResponseEntity(role, HttpStatus.OK);
    }
}
