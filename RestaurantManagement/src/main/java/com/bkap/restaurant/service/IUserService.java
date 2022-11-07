package com.bkap.restaurant.service;

import com.bkap.restaurant.entities.User;
import org.springframework.data.domain.Page;

public interface IUserService {
    Page<User> getListUsers(int page, int pageSize);
    User getUserById(Long userId);
    User createUser(User user);
    User updateUser(Long userId, User user);
    Boolean deleteUser(Long userId);
}
