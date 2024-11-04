package org.koreait.member.services;

import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// 회원 가입 기능
public class JoinService {


    // 변수로 의존성 확장!
    // 원래는 final 붙이는게 맞음
    // @Autowired 사용해 의존성 자동 주입
    // 직접 바로 대입
    @Autowired
    public JoinValidator validator;

    @Autowired
    // @Qualifier("mRepo")
    public MemberRepository repository;

    // 생성자로 의존 관계 -> 열어놓음
    /*
    public JoinService(JoinValidator validator, MemberRepository repository) {

        this.validator = validator;
        this.repository = repository;
    }

     */

    // 가입 처리
    // RequestJoin form = 데이터 클래스이므로 Spring이 관리 X
    // 그때그때 다른 Data를 받고 새 객체를 생성하므로 SingleTonedp 에 부적합
    public void process(RequestJoin form){

        /*유효성 검사
        단일 체계 원칙(SOLID - S)에 따라 여기서 직접 유효성 검사 코드를 쓰지 않고 역할을 나눔
         */
        validator.validate(form);

        // 유효성 검사 통과했으니 DB 영구 저장 처리
        repository.register((form));
    }
}