package com.example.fooddeliveryerd.service.news;

import com.example.fooddeliveryerd.model.dto.request.NewsRequestDto;
import com.example.fooddeliveryerd.model.dto.response.NewsResponseDto;
import com.example.fooddeliveryerd.service.IGeneralService;

public interface INewsService extends IGeneralService<NewsResponseDto, NewsRequestDto> {
}
