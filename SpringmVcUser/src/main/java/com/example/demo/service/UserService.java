package com.example.demo.service;
import com.example.demo.model.Login;
import com.example.demo.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}