// DB 연결

package org.koreait.exam01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex02 {

    /*
    DataSource에 이미 추가되어 있음

    @BeforeAll
    static void setup() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
     */

    @Test
    @DisplayName("Tomcat JDBC를 이용한 Connection Test")
    void test1 () {

        // 공통 기능 쓰는 곳

        // java말고 tomcat으로 선택
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

        try (Connection conn = ds.getConnection()) {

            // 핵심 기능 쓰는 곳 (try 함수지역내)

            System.out.println(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("HikariCP 이용한 Connection Test")
    void test2() {

        HikariConfig config = new HikariConfig();

        /* 연결 설정 S */
        config.setDriverClassName("oracle.jdbc.driver.OracleDriver");

        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");

        config.setUsername("spring6");

        config.setPassword("oracle");
        /* 연결 설정 E */

        HikariDataSource ds = new HikariDataSource(config);

        try (Connection conn = ds.getConnection()) {

            System.out.println(conn);

        } catch (SQLException e) {
            e.printStackTrace();;
        }
    }
}