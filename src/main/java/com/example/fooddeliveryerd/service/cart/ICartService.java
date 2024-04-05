package com.example.fooddeliveryerd.service.cart;

import com.example.fooddeliveryerd.model.dto.request.CartRequestDto;
import com.example.fooddeliveryerd.model.dto.response.CartResponseDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface ICartService extends IGeneralService<CartResponseDto, CartRequestDto> {
}
