package com.bkap.restaurant.serviceImpl;

import com.bkap.restaurant.entities.User;
import com.bkap.restaurant.repository.UserRepository;
import com.bkap.restaurant.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> getListUsers(int page, int pageSize) {
        Page<User> listUsers = userRepository.findAll(PageRequest.of(page, pageSize));
        return listUsers;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long userId) {
        return null;
    }
}
