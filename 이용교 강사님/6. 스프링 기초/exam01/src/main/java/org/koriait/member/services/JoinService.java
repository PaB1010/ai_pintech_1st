// 회원 가입 서비스

package org.koriait.member.services;

import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;
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
    private Validator<RequestJoin> validator;

    /*
    setter로 주입해 구성

    연관 관계 -> Validator와 JoinService
    JoinService 객체를 생성할때 joinValidator가 필수는 아니기때문
    @param joinValidator

    public void setValidator(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }
     */

    /*
    생성자 매개 변수로 주입해 구성

    의존 관계
    @param joinValidator
    JoinService 객체를 생성을 위해서는 joinValidator가 필수로 주입되어야하기때문
     */

    public JoinService(Validator<RequestJoin> joinValidator) {
        this.validator = joinValidator;
    }


    /*
    가입 처리

    RequestJoin - DTO (Data Transfer Object)
    -> 사용자가 입력한 값을 전달하는 역할

    얘가 검증까지 하면 안됨

    넘어오는 RequestJoin이 무조건 필요하기때문에
    의존성 : JoinService와 RequestJoin
     */
    public void process(RequestJoin form) {


    }
}