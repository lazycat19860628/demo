package com.example.demo.dao;
import com.example.demo.domain.SysUser;
public interface AuthService {
    SysUser register(SysUser userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
