package exam01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities.Board;
import org.koreait.config.AppCtx;
import org.koreait.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex02 {

    @Autowired
    private SqlSessionFactory sessionFactory;

    @Autowired
    private BoardMapper boardMapper;

    @Test
    @DisplayName("XML - SqlSession 이용한 조회 테스트 (지양)")
    void test1() {

        SqlSession session = sessionFactory.openSession();

        Board board = new Board();

        board.setSubject("%제목%");

        List<Board> items = session.selectList("org.koreait.mapper.BoardMapper.getList3", board);

        System.out.println(items);
    }

    @Test
    @DisplayName("Interface & XML 혼용 조회 테스트 (지향)")
    void test2() {

        Board board = new Board();

        // board.setSubject("%제목%");
        
        // board.setSubject("제목");

         board.setContent("%내용%");

        // List<Board> items = boardMapper.getList3(board);
        List<Board> items = boardMapper.getList4(board);

        System.out.println(items);
    }

    @Test
    @DisplayName("INSERT & UPDATE & DELETE 의 정수 반환값")
    void test3() {
        Board board = new Board();

        board.setSubject("테스트 제목...");

        board.setContent("테스트 내용...");

        board.setPoster("테스트 작성자...");

        // int affectedRows = boardMapper.register(board);

        // System.out.println(affectedRows);

        System.out.println("board:" + board);
    }

    @Test
    @DisplayName("단일 값만 조회할때 resultType 사용")
    void test4() {

        long total = boardMapper.total();

        System.out.println(total);
    }
}
