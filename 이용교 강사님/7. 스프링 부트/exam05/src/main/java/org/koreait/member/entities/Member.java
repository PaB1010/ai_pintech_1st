package org.koreait.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity // @Entity = 영속성 관리 가능 형태, 반드시 기본키 명시 필수! (독립적인 존재 구분)
public class Member {

    @Id // 기본키
    private Long seq;
    private String email;
    private String password;
    private String name;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}