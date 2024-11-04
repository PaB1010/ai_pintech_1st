// 회원 가입 서비스

package org.koriait.member.services;

import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;
import org.koriait.member.repositories.MemberRepository;
import org.koriait.member.validators.JoinValidator;

// 회원 가입 기능
public class JoinService {

    /*
       유연성이 떨어지므로 이렇게 사용 X
       상속도 확장에 불리하므로 Class의 구성 부품중 하나(변수 정의)로 확장
       개방구조시 통제에 유리
       JoinValidator validator = new JoinValidator()
        */

    // 유연성 없이 고정되어 닫혀버리므로 바람직하지 않음
    // private JoinValidator joinValidator = new JoinValidator();

    // 구성! = 확장에 열린 구조
    // 구성 방법 1. setter 2. 생성자 매개 변수
    // private Validator<RequestJoin> validator;

    private final Validator<RequestJoin> validator;
    // 만약 final로 선언시 무조건 한번 초기화해야하기때문에 더더욱 의존관계로 확정

    private final MemberRepository repository;


    /*
    setter로 주입해 구성

    연관 관계 -> Validator와 JoinService
    JoinService 객체를 생성할때 joinValidator가 필수는 아니기때문
    @param joinValidator

    public void setValidator(Validator<RequestJoin> validator) {
        this.validator = validator;
    }
     */

    /*
    생성자 매개 변수로 주입해 구성

    의존 관계
    @param joinValidator
    JoinService 객체를 생성을 위해서는 joinValidator가 필수로 주입되어야하기때문
     */

    public JoinService(Validator<RequestJoin> validator, MemberRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }


    /*
    가입 처리 & 연관 관계

    RequestJoin - DTO (Data Transfer Object)
    -> 사용자가 입력한 값을 전달하는 역할

    얘가 검증까지 하면 안됨

    넘어오는 RequestJoin이 무조건 필요하기때문에
    의존성 : JoinService와 RequestJoin
     */
    public void process(RequestJoin form) {


        // form & joinService에 서로 영향을 주고 받는 관계
        // -> 변화에 영향을 받음
        // 즉 통제가 필요 - 메서드 안에 감출 필요(캡슐화) / 변화에 닫힌 구조
        validator.check(form);
    }
}