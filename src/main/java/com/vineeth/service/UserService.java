package com.vineeth.service;

import com.vineeth.exception.UserException;
import com.vineeth.modal.User;

import java.util.List;

public interface UserService {
    User CreateUser(User user);
    User getUserById(Long id) throws UserException;
    List<User> getAllUsers();
    void deleteUser(Long id) throws UserException;
    User updateUser(Long id,User user) throws UserException;
}
