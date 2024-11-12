package org.koreait.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// @Controller
public class MemberController2 {

    /*
    @GetMapping("/member/login")
    public String login(/*@RequestParam("name") String name ) {

       // System.out.printf("name:%s%n", name);

        return "member/form";
    }
     */

    // Spring Container에 담겨있으므로 Autowired 가능
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private HttpSession session;


    /*
    // 통일성 있게 ModelAndView 형태로 반환
    @GetMapping("/member/login")
    public ModelAndView login() {

        ModelAndView mv = new ModelAndView();

        // addObject() = 데이터 추가 메서드
        mv.addObject("message", "안녕하세요");
        
        // Template 경로
        mv.setViewName("member/form");

        return mv;
    }

    @GetMapping("/member/login")
    public String login() {

        System.out.println(request);
        System.out.println(response);
        System.out.println(session);


        // View를 찾기 위한 정보
        return "member/form";
        // WEB-INF/templates/member/form.jsp
    }


    // Servlet 기본 객체를 매개변수로 의존성 주입
    @GetMapping("/member/login")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        System.out.println(request);
        System.out.println(response);
        System.out.println(session);

        return "member/form";
    }
     */


    // Model 객체 = 속성 설정
    // HandlerAdapter 개입
    @GetMapping("/member/login")
    public String login(Model model) {

        model.addAttribute("message", "안녕하세요");

        return "member/form";
    }

    @PostMapping("/member/login")
    public String loginPs(RequestLogin form) {

        System.out.println(form);

        return "member/form";
    }

    /*
    @PostMapping("/member/login")
    public String loginPs(@RequestParam("email") String email, @RequestParam("password") String pass, @RequestParam(name="saveEmail", required = false) boolean saveEmail) {
        System.out.println("회원가입 처리쪽 유입!!");
        System.out.printf("email=%s, password=%s, saveEmail=%s%n", email, pass, saveEmail);
        return "member/form";
    } */
}
