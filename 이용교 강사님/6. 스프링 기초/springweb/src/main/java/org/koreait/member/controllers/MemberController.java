package org.koreait.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/member") // 공통되는 /member를 @RequestMapping으로 정의해 주소 고정
public class MemberController {

    /*
    // @GetMapping("/member/login")
    // 요청 메서드 여러개 일때만 RequestMapping 보통은 @GetMapping 사용
    @RequestMapping(path={"/member/login", "/user/login"},
            method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {

        System.out.println("로그인 페이지 유입");

        return "member/form";
    }
     */


    @GetMapping("/login")
    /*
    특정 Type 요청 Param이 있을떄만 유입 가능하게 한정
    -> /member/login?type=어떤 값
    @GetMapping(path="/login", params={"type"})
    header는 요청 header에 Authorization 값이 있는 경우에만 유입 가능
    -> @GetMapping(path="/login", headers="Authorization")
    produces = "applicatioin/json" -> 응답 header Content-Type : applacation/json
    -> @GetMapping(path="/login", produces = "application/json")
     */
    public String login() {

        System.out.println("로그인 양식 페이지");

        return "member/form";
    }

    // @PostMapping("/member/login")
    @PostMapping("/login")
    public String loginPs() {

        return "member/form";
    }

    // @GetMapping("/member/join")
    @GetMapping("/join")
    public String join() { // 회원 가입 양식

        return "member/joinForm";
    }

    // @PostMapping("/member/join")
    @PostMapping("/join")
    public String joinPs(RequestJoin form/*, Model model*/) { // 회원 가입 처리

        // 커맨드 객체는 자동으로 EL 속성으로 추가, 속성명이 클래스명 & 앞자는 소문자
        System.out.println(form);

        /*
        String[] hobby = form.getHobby();
        System.out.println(Arrays.toString(hobby));
         */

        // model.addAttribute("requestJoin", form)

        /*
            회원 가입 처리 완료 후 주소 이동 (로그인 페이지로 이동)
            정석적인 방법으로는
            응답 header Location : /springweb/member/login
            HttpServletResponse
            response.sendRedirect(request.getContextPath() + "/member/login");
         */


        return "member/joinForm";

        // forward보다 redirect 주로 사용!!
        // 실제로 path가 이동되고, 응답 헤더에 Location을 실는 형태
        // 응답 header Location : /springweb/member/login
        // return "redirect:/member/login";


        // forward = 실행 과정을 login으로 치환해버리는 형태
        // 실제 path는 이동하지 않음
        // return "forward:/member/login";
        // RequestDispatcher rd = request.getRequestDispatcher("...");
        // rd.forward(request, response);...

    }
}