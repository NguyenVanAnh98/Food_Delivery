package com.example.fooddeliveryerd.service.user;

import com.example.fooddeliveryerd.model.dto.request.UserRequestDto;
import com.example.fooddeliveryerd.model.dto.response.UserResponseDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface IUserService extends IGeneralService<UserResponseDto, UserRequestDto> {
}
