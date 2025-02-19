package exam01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities.Board;
import org.koreait.config.AppCtx;
import org.koreait.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;
import java.util.List;


// @ExtendWith(SpringExtension.class)
// @ContextConfiguration
// SpringJUnitConfig 사용시 자동으로
@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class) // Test 용 Spring Container 생성
public class Ex01 {

    @Autowired
    private SqlSessionFactory sessionFactory;

    @Autowired
    private BoardMapper boardMapper;

    @Test
    void test1() {

        // System.out.println(sessionFactory);
        // org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@5cdd09b1

        // autoCommit 기본값 = false
        // SqlSession session = sessionFactory.openSession(true);
        SqlSession session = sessionFactory.openSession();

        // Connection Pool 구현 객체 생성
        // JDBC API 를 직접 사용할때 - 거의 없는 일, Framework 로 편한 사용하게 됨
        /**
         * Statement
         * PreparedStatement
         * CallableStatement
         */
        Connection con = session.getConnection();

        System.out.println(con);
        // ProxyConnection[PooledConnection[oracle.jdbc.driver.T4CConnection@62b3df3a]]

        // session.commit();
    }

    @Test
    void test2() {

        List<Board> items = boardMapper.getList();

        items.forEach(System.out::println);
    }
}
