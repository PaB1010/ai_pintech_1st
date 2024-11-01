// Join Service Test

package org.koriait.member.services;

import org.junit.jupiter.api.Test;
import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;
import org.koriait.member.validators.AdvancedJoinValidator;
import org.koriait.member.validators.JoinValidator;

public class JoinServiceTest {

    @Test
    void test1(){

        Validator<RequestJoin> validator = new AdvancedJoinValidator();
        JoinService joinService = new JoinService(validator);
    }

    @Test
    void test2() {

        JoinService2 joinService2 = new JoinService2(new JoinValidator());
    }

    // 조립된 객체 가져옴
    @Test
    void test3() {

        ServiceContainer container = new ServiceContainer();

        // container가 통제해서 완성된 객체 주입
        JoinService joinService = container.joinService();
        JoinService2 joinService2 = container.joinService2();
    }
}
