package com.belajarspring.belajarspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String password;
}
