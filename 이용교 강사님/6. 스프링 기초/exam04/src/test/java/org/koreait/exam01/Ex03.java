// DB 연결 핵심 기능과 공통 기능 분리

package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03 {

    private Connection conn;

    @BeforeEach
    void init() throws Exception {
        DataSource ds = new DataSource();

        /* 연결 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");

        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");

        ds.setUsername("spring6");

        ds.setPassword("oracle");
        /* 연결 설정 E */

        /* Connection Pool 설정 S */

        // 초기 Connection 생성 개수 설정 (기본값 10)
        ds.setInitialSize(2);

        // Connection Pool에서 가져올 수 있는 최대 개수 (기본값 100)
        ds.setMaxActive(10);

        ds.setMaxIdle(10);

        // 유휴 Connection 객체 테스트 활성화 (기본값 false)
        ds.setTestWhileIdle(true);

        // 유효 Connection 검사 주기 밀리초 (기본값 5000밀리초(5초))
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000);

        // 유휴 시간이 이 값을 초과하면 Pool에서 Coonection 제거 (기본 값 60000밀리초(60초))
        ds.setMinEvictableIdleTimeMillis(50 * 1000);
        /* Connection Pool 설정 E */

        conn = ds.getConnection();
    }

    @AfterEach
    void close() throws Exception {
        conn.close();
    }

    @Test
    @DisplayName("Statement 객체 생성 및 연습")
    void test1() {
        try (Statement stmt = conn.createStatement()) {

            String email = "user01@test.org";
            String password = "12345678";

            String userName = "사용자01";

            // String username = ";SELECT * FROM MEMBER; --";
            // 외부 양식에서 유입되므로 SQL 인젝션과 같은 DB 해킹 관련 위험성이 있음

            String sql = String.format("INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME) " +
                    "VALUES (MEMBER_SEQ.nextval, '%s', '%s', '%s')", email, password, userName);

            int affectedRows = stmt.executeUpdate(sql);

            System.out.println(affectedRows);

        } catch (SQLException e) {
            e.printStackTrace();;
        }
    }

    @Test
    @DisplayName("PreparedStatement 객체 생성 및 연습")
    void test2() {
        
        // 공격을 차단하기 위해 ?로 값 정제
        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME) " +
                " VALUES (MEMBER_SEQ.nextval, ?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 값 바인딩 필요 (? 순서 설정해줄수 있도록 setter)
            pstmt.setString(1, "USER02");
            pstmt.setString(2, "12345678");
            pstmt.setString(3, "사용자02");

            int affectedRows = pstmt.executeUpdate();
            System.out.println(affectedRows);

            
        } catch (SQLException e) {

            e.printStackTrace();;
        }
    }
}