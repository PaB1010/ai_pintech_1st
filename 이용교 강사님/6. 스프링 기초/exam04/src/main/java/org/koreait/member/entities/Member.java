// Data클래스 (exam02_Ex01)
// DB SELCET 값을 담기 위한 클래스

package org.koreait.member.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Member {

    @Id // 기본키로 사용할 Column

    // wrapper 클래스 형태가 유연
    private Long seq;
    private String email;
    private String password;
    private String username;
    private LocalDateTime regdt;
    private LocalDateTime moddt;
}