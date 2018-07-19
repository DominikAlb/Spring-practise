package com.example.demo.dao;
import com.example.demo.model.Login;
import com.example.demo.model.User;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}