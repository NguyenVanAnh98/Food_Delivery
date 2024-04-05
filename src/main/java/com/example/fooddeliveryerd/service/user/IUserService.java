package com.example.fooddeliveryerd.service.user;

import com.example.fooddeliveryerd.model.User;
import com.example.fooddeliveryerd.model.dto.req.UserReqDto;
import com.example.fooddeliveryerd.model.dto.res.UserResDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface IUserService extends IGeneralService<User, UserReqDto, UserResDto> {

}
