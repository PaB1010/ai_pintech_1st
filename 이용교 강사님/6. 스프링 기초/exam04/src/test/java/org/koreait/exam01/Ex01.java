package org.koreait.exam01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {

    private Connection conn;

    // 실행전 한번만 수행
    @BeforeAll
    static void setup() throws Exception{

        // runtimeOnly로 'com.oracle.database.jdbc:ojdbc11:23.5.0.24.07' 를
        // 사용하기 위해 Class 동적 호출
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    // 각 test마다 Connection
    @BeforeEach
    void init() throws Exception {
        // JDBC = Java DataBase Connectivity
        String url = "jdbc:oracle:thin:@localhost:1521:XE";

        // 접속할때마다 연결 객체를 새로 생성
        conn = DriverManager.getConnection(url, "spring6", "oracle");
    }

    @Test
    void test1() {
        System.out.println(conn);
        // oracle.jdbc.driver.T4CConnection@202b0582
    }

    // 각 test마다 close
    @AfterEach
    void close() throws Exception {
        conn.close();
    }
}