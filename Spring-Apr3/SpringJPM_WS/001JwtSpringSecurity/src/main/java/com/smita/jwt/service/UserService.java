package com.smita.jwt.service;

import java.util.List;

import com.smita.jwt.model.User;
import com.smita.jwt.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
