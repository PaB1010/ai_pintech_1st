// 게시글 조회 서비스 클래스

package org.koreait.board.service;

import org.koreait.board.entities.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardInfoService {

    public List<Board> getList() {

        ArrayList<Board> items = new ArrayList<>();

        // 10개의 게시글 생성
        for (long i = 1; i <= 10L; i++) {

            Board item = new Board();

            item.setSeq(i);

            item.setPoster("작성자 " + i);
            item.setSubject("제목 " + i);
            item.setContent("내용 " + i);

            items.add(item);
        }
        return items;
    }
}