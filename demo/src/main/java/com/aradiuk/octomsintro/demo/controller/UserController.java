package com.aradiuk.octomsintro.demo.controller;

import com.aradiuk.octomsintro.demo.repository.UserRepository;
import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.inframapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    UserController(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @GetMapping
    List<UserBaseInfoDto> getAllUsers() {
        return userRepository.getAllUsers().stream().map(userMapper::map).toList();
    }

    @GetMapping("random")
    UserBaseInfoDto getRandomUser() {
        return userMapper.map(userRepository.getRandomUser());
    }
}
