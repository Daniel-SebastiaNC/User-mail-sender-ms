package dev.java10x.user.controller;

import dev.java10x.user.dto.UserDto;
import dev.java10x.user.model.UserModel;
import dev.java10x.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserModel> create(@RequestBody UserDto user) {
        var userModel = new UserModel();

        BeanUtils.copyProperties(user, userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userModel));
    }
}
