// main말고 test에서 연습

package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.member.Member;

public class Ex01 {

    @Test
    void test1(){

        // @AllArgsConstructor 사용했던 생성자 함수
        // Member member = new Member(2L, "user02@test.org", "12345678");

        // Member member = new Member("user03@test.org", "12345678");

        /*
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
         */

        // System.out.println(member);
    }

    @Test
    void test2() {

        // @Builder 사용시 생성자가 private 고정이라 오류
        // new 생성 불가능
        // Member member = new Member();

        // 객체 생성
        Member member = Member.builder()
                .seq(1L)
                .email("user04@test.org")
                .password("12345678")
                .build();

        System.out.println(member);
    }
}