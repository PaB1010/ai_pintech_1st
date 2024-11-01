// 의존객체 통제하여 주입 관리 조립하는 클래스

package org.koriait.member.services;

import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;
import org.koriait.member.validators.AdvancedJoinValidator;
import org.koriait.member.validators.JoinValidator;

public class ServiceContainer {

    // 필요할때마다 호출해서 주입
    public Validator<RequestJoin> joinValidator() {

        // return new JoinValidator();
        return new AdvancedJoinValidator();
    }

    public JoinService joinService()  {

        return new JoinService(joinValidator());
    }

    public JoinService2 joinService2() {

        return new JoinService2(joinValidator());
    }

}