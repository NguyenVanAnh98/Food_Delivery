package com.example.fooddeliveryerd.service.user;

import com.example.fooddeliveryerd.model.dto.request.UserRequestDto;
import com.example.fooddeliveryerd.model.dto.response.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public Iterable<UserResponseDto> listAll() {
        return null;
    }

    @Override
    public UserResponseDto getById(long id) {
        return null;
    }

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
