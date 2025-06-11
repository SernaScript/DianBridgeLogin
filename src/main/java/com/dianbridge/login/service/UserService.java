package com.dianbridge.login.service;

import com.dianbridge.login.entity.User;

public interface UserService {
    User register(User user);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    User findByUsername(String username);
    User findByEmail(String email);
}
