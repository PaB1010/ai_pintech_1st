// 데이터 클래스

package org.koreait.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    
    // 회원 번호
    private long seq;

    // 이메일
    private String email;
    
    // 비밀 번호
    private String password;

    // 회원명
    private String userName;
    
    // 가입 일시
    private LocalDateTime regDt;

    // 수정 일시
    private LocalDateTime modDt;

    // 가입 일시(문자열)
    private String regDtStr;
}
