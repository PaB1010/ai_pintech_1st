package org.koreait.board.repositories;

import org.koreait.board.entities2.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {

    /**
     * 지연 로딩 N + 1 문제 해결법 중
     * fetch Join : JPQL 문법 (비선호)
     * @return
     */
    @Query("SELECT b1 FROM BoardData b1 Join Board b2 ON b1.bid = b2.bid")
    List<BoardData> getItems();

}