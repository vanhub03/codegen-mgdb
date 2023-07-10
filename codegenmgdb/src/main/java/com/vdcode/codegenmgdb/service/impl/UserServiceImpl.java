package com.vdcode.codegenmgdb.service.impl;

import com.vdcode.codegenmgdb.Repository.UserRepository;
import com.vdcode.codegenmgdb.entities.User;
import com.vdcode.codegenmgdb.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
