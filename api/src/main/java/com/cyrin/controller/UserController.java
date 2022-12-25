package com.cyrin.controller;

import com.cyrin.entity.User;
import com.cyrin.service.UserDetailsImpl;
import com.cyrin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    ResponseEntity<User> getUser() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID userId = userDetails.getId();
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @GetMapping("/all")
    ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUserAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getUser(String id) {
        return ResponseEntity.ok(userService.getUser(UUID.fromString(id)));
    }
}
