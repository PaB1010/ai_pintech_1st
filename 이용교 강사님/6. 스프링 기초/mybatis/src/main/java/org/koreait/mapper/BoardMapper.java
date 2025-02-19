package org.koreait.mapper;

import org.apache.ibatis.annotations.Select;
import org.koreait.board.entities.Board;

import java.util.List;

public interface BoardMapper {

    // 자동으로 Spring 관리 객체가 됨
    // 즉 의존 주입이 가능해짐

    @Select("SELECT * FROM BOARD_DATA")
    List<Board> getList();
}