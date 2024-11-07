// JdbcTemplate 활용 Query 작성

package org.koreait.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Transactional
@SpringJUnitConfig
// Spring 컨테이너가 관리할 기능을 알려주는 설정 클래스
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    // 의존성 주입
    // Test시에는 final 사용 X @Autowired 필수
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("INSERT Query Test")
    void test1() {

        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME) VALUES (MEMBER_SEQ.nextval, ?, ?, ?)";

        int affectedRows = jdbcTemplate.update(sql, "user99@test.org", "123456", "사용자99");

        // RuntimeException인 DataAccessException으로 바뀌었기때문에 예외가 발생할 경우만 코드를 써주면 되는데
        // 대부분 예외가 없기때문에 아예 작성하지 않음

        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("UPDATE Query Test")
    void test2() {

        // 조건 : EMAIL값이 user로 시작하는 (모두 적용)
        String sql = "UPDATE MEMBER SET USERNAME=? WHERE EMAIL LIKE 'user%'";

        int affectedRows = jdbcTemplate.update(sql, "(수정)사용자명");

        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("SELECT Query Test - 전체 목록")
    void test3() {

        // 값을 담을 Data 클래스 필요(ValueOf)
        // member_entities_Member
        String sql = "SELECT * FROM MEMBER LIKE ?";
        List<Member> members = jdbcTemplate.query(sql, this::mapper, "%tnwjd%");
        members.forEach(System.out::println);
    }

    @Test
    @DisplayName("SELECT query - 단일 조회")
    void test4() {

        try {

            String sql = "SELECT * FROM MEMBER WHERE EMAIL = ?";
            Member item = jdbcTemplate.queryForObject(sql, this::mapper, "%user%");
            System.out.println(item);
        } catch (DataAccessException e) {

            System.out.println("데이터 없음");
        }
    }

    @Test
    @DisplayName("단일 Data 조회 - 사용자명")
    void test5() {

        String sql = "SELECT USERNAME FROM MEMBER WHERE EMAIL = 'user03@test.org'";
        String userName = jdbcTemplate.queryForObject(sql, String.class);
        System.out.println(userName);
        // (수정)사용자명

        String sql2 = "SELECT COUNT(*) FROM MEMBER";
        long total = jdbcTemplate.queryForObject(sql2, long.class);
        System.out.println(total);
        // 6
    }

    private Member mapper(ResultSet rs, int i) throws SQLException {
        Member member = new Member();
        member.setSeq(rs.getLong("SEQ"));
        member.setEmail(rs.getString("EMAIL"));
        member.setPassword(rs.getString("PASSWORD"));
        member.setUsername(rs.getString("USERNAME"));
        member.setRegdt(rs.getTimestamp("regdt").toLocalDateTime());

        Timestamp modDt = rs.getTimestamp("moddt");
        if (modDt != null) {
            member.setModdt(modDt.toLocalDateTime());
        }

        return member;
    }
}