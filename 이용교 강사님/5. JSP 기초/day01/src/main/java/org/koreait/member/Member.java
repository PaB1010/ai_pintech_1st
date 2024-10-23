// lombok 사용

// main/java 경로에 관례상 그룹명으로 패키지 생성
package org.koreait.member;

import lombok.*;

// set & get 추가
// @Setter @Getter @ToString

// @Setter @Getter @ToString @EqualsAndHashCode 모두 포함
// @Data

// 기본 생성자를 private로
// @NoArgsConstructor(access = AccessLevel.PRIVATE)

// 모든 인스턴스 변수 생성자 매개변수로 생성
// 기본 생성자 함수는 오류
// Ex) Member member = new Member();
// @AllArgsConstructor

// 필수 인스턴스 변수 -> 생성자 매개변수로 생성
// email & password를 필수 인스턴스 변수로 하고싶을때
// 자료형 앞에 final 추가해 상수화
// @NonNull 사용해 필수 변수임을 표기

// 필수 인스턴스 변수 -> 생성자 매개변수로 생성
// @RequiredArgsConstructor

@Builder
@ToString
public class Member {

    private long seq; // 회원 번호

    private final String email; // 이메일

    @NonNull
    @ToString.Exclude // ToString에서 배제, 반대로는 Include
    private String password; // 비밀번호
}