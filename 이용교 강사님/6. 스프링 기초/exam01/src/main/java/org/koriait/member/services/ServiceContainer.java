// 의존객체 통제하여 주입 관리 조립하는 클래스
// spring이 이 관리 & 조립을 대신 해주므로 앞으로 안함

package org.koriait.member.services;

import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;
import org.koriait.member.repositories.MemberRepository;
import org.koriait.member.services.JoinService;
import org.koriait.member.services.JoinService2;
import org.koriait.member.validators.AdvancedJoinValidator;
import org.koriait.member.validators.JoinValidator;

public class ServiceContainer {

    // 필요할때마다 호출해서 주입
    public Validator<RequestJoin> joinValidator() {

        // return new JoinValidator();
        return new AdvancedJoinValidator();
    }

    public MemberRepository memberRepository() {

        return new MemberRepository();
    }

    // 객체 조립
    public JoinService joinService()  {

        return new JoinService(joinValidator(), memberRepository());
    }

    public JoinService2 joinService2() {

        return new JoinService2(joinValidator());
    }

}