package org.koreait.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

// 커맨드 객체
@Data
public class RequestJoin {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, max = 40) // 8자리 이상 40글자 이하 문자열
    private String password;

    @NotBlank
    private String confirmPassword;

    @NotBlank
    private String name;
    private String mobile; // 휴대전화 번호

    @AssertTrue
    private boolean agree; // 회원가입 약관 동의 여부
}