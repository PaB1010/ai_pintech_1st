// 데이터 클래스 생성 (Lombok 활용해 Get & Set)

package org.koreait.board.entities;

import lombok.Data;

// @Getter & @Setter & @ToString & @EqualsAndHashCode = @Data
@Data
public class Board {

    // 게시글 번호
    private long seq;

    // 게시글 작성자
    private String poster;

    // 게시글 제목
    private String subject;

    // 게시글 내용
    private String content;
}