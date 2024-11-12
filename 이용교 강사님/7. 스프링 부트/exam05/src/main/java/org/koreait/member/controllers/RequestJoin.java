package org.koreait.member.controllers;

import lombok.Data;

// 커맨드 객체
@Data
public class RequestJoin {

    private String email;
    private String password;
    private String confirmPassword;
    private String name;
}