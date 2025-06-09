package com.dianbridge.login.service;

import com.dianbridge.login.entity.User;

public interface UserService {
    User register(User user);
    boolean existsByUsername(String username);

    User findByUsername(String username);
}
