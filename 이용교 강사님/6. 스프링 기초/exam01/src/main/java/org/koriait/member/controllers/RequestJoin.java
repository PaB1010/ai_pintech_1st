// 요청 데이터를 받는 C

package org.koriait.member.controllers;

import lombok.Data;

@Data
public class RequestJoin {

    private String email;
    private String password;
    private String confirmPassword;
    private String userName;

    // 약관 동의
    private boolean agree;
}