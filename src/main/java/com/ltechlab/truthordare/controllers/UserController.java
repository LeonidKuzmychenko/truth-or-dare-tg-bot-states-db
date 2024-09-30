package com.ltechlab.truthordare.controllers;

import com.ltechlab.truthordare.dtos.UserUpdateResponse;
import com.ltechlab.truthordare.models.User;
import com.ltechlab.truthordare.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public User getAndCheckToExist(@RequestParam("chatId") String chatId) {
        return userService.getAndCheckToExist(chatId);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@RequestBody UserUpdateResponse userUpdateResponse) {
        User user = userService.getAndCheckToExist(userUpdateResponse.getChatId());
        user.setCommand(userUpdateResponse.getCommand());
        return userService.save(user);
    }

}