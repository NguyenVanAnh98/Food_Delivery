package com.example.fooddeliveryerd.model.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReqDto {
    private int id;
    private String uuid;
    private String email;
    private String password;
}
