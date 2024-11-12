package org.koreait.member.controllers;

import lombok.Data;

// 주소처럼 중복 될 수 있는 커맨드 객체는 따로 클래스 분리
@Data
public class RequestAddress {
    
    private String zipcode;
    private String address;
    private String addressSub;
}