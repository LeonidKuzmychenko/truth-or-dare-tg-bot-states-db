package com.ltechlab.truthordare.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserUpdateResponse {
    private String chatId;
    private String command;
}
