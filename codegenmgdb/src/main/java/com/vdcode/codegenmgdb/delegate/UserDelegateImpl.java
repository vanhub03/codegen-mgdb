package com.vdcode.codegenmgdb.delegate;

import com.openapi.gen.springboot.api.UserApiDelegate;
import com.openapi.gen.springboot.dto.UserDTO;
import com.vdcode.codegenmgdb.entities.User;
import com.vdcode.codegenmgdb.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserDelegateImpl implements UserApiDelegate {

    private final UserService userService;

    public UserDelegateImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDTO> saveUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        userService.saveUser(user);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
