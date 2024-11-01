// JoinValidator 의존 객체 추가

package org.koriait.member.services;

import org.koriait.global.validators.Validator;
import org.koriait.member.controllers.RequestJoin;

public class JoinService2 {

    private Validator<RequestJoin> validator;

    public JoinService2(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process() {

    }
}