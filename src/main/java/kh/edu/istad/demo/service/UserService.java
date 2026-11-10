package kh.edu.istad.demo.service;

import kh.edu.istad.demo.dto.UserCreateRequest;
import kh.edu.istad.demo.dto.UserResponse;
import kh.edu.istad.demo.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

//    delete user by id
//    return type
//    parameter type
    void displayID(UUID id);

    UserResponse create(UserCreateRequest userCreateRequest);

    void deleteById(UUID id);

    List<UserResponse> getAll();

    User getById(UUID id);
}
