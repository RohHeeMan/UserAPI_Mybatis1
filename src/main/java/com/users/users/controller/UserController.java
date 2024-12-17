package com.users.users.controller;

import com.users.users.dto.UserDTO;
import com.users.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    // 생성자 주입방식
    private final UserService userService;

    // 조회 메서드 작성
    @GetMapping
    private List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") int id, Model model){
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO user){
        return userService.addUser(user);
    }

    @PostMapping("/{id}")
    public UserDTO updateUser(@PathVariable("id") int id, @RequestBody UserDTO user){
        return userService.updateUser(id, user);
    }

}
