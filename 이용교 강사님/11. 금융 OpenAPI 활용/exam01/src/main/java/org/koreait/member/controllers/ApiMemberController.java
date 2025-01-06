package org.koreait.member.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class ApiMemberController {

    @PostMapping("/join")
    // @RequestBody = 요청 body 인 form 형태가 JSON 형태라는 것을 명시
    // application/json
    public void joinPs(@RequestBody RequestJoin form) {

        System.out.println(form);
    }
}