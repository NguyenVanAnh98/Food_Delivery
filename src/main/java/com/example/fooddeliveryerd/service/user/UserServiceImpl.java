package com.example.fooddeliveryerd.service.user;

import com.example.fooddeliveryerd.model.User;
import com.example.fooddeliveryerd.model.dto.res.UserResDto;
import com.example.fooddeliveryerd.repository.IUserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

import static java.util.Arrays.stream;

@Service

public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public Iterable<UserResDto> listAll() {


//        return null;
    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
