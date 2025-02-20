package org.koreait.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.koreait.board.entities.Board;

import java.util.List;

public interface BoardMapper {

    // 자동으로 Spring 관리 객체가 됨
    // 즉 의존 주입이 가능해짐

    @Select("SELECT * FROM BOARD_DATA")
    List<Board> getList();

    // 둘중 어느쪽 매개변수인지 구분 못하므로 @Param("매칭변수") 사용해 해당 데이터 교체
    @Select("SELECT * FROM BOARD_DATA WHERE SUBJECT LIKE #{skey1} AND CONTENT LIKE #{skey2}")
    List<Board> getList2(@Param("skey1") String skey1, @Param("skey2") String skey2);

    @Select("SELECT * FROM BOARD_DATA WHERE seq=#{seq}")
    Board get(long seq);

    // 함수명이 XML 파일 내의 id 값이 됨
    List<Board> getList3(Board board);

    List<Board> getList4(Board board);

    // INSERT & UPDATE & DELETE 반환값 = 반영된 레코드 개수
    int register(Board board);

    long total();
}