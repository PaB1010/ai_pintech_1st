// 커맨드 객체(VTO)
// 회원 가입 정보를 가져다 나를 클래스

package org.koreait.member.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestJoin {

    private String email;
    private String password;
    private String confirmPassword;
    
    // private String[] hobby;
    // 여러개의 입력을 받을 시 배열보다는 List 선호
    private List<String> hobby;

    // 중첩된 커맨드 객체(RequestAddress에 분리되어 있음)
    private RequestAddress addr;
}