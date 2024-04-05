package com.example.fooddeliveryerd.service.order;

import com.example.fooddeliveryerd.model.dto.request.OrderRequestDto;
import com.example.fooddeliveryerd.model.dto.response.OrderResponseDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface IOrderService extends IGeneralService<OrderResponseDto, OrderRequestDto> {
}
