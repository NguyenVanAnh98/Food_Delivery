package com.example.fooddeliveryerd.service.message;

import com.example.fooddeliveryerd.model.dto.request.MessageRequestDto;
import com.example.fooddeliveryerd.model.dto.response.MessageResponseDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface IMessageService extends IGeneralService<MessageResponseDto, MessageRequestDto> {
}
