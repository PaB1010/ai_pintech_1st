package org.koreait.member.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// 요청을 받으려면 HttpServlet(추상메서드) 상속 필수
public class LoginController extends HttpServlet {

    // 인스턴스 변수 사용 지양!! (동시성 문제)
    // private String value;

    // init = Servlet 객체 생성시 최초 1번 실행
    @Override
    public void init(ServletConfig config) throws ServletException {
        // ServletConfig의 주요 메서드 : 설정값 조회 메서드
        // 주요 메서드 -> String getInitParameter(String name);
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1 = %s%n", key1);
        System.out.printf("key2 = %s%n", key2);
    }
    /*
    public void init() throws ServletException {
        System.out.println("Servlet 객체 생성시 최초 1번 실행");
        // ★ 설정 값을 최초 한번 조회 후 Servlet 객체 내에서 유지 ★
        // 최초 유입 로그

     */


    // destroy = Servlet 객체 소멸 직전에 1번만 실행
    @Override
    public void destroy() {
        System.out.println("Servlet 객체 소멸 직전에 1번만 실행");
        // 공통 자원 해제 & 로그 기록
    }

    @Override
    // HttpServletRequest req & HttpServletResponse resp = Tomcat 출처 interface
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // doGet - 매요청마다 실행
        System.out.println("doGet() 매요청마다 실행");
        
        // System.out.println("로그인 페이지 입니다.");


        /*
        // ★ 응답 헤더 Text/html ★
        resp.setContentType("text/html");
        // Servlet 구버전의 경우 설정
        resp.setCharacterEncoding("UTF-8");
         */

        // ★ 응답 헤더 Text/html ★
        // 보통 이렇게 한번에 사용
        resp.setContentType("text/html;charset=UTF-8");

        // 생성된 객체 내에서 조회해야하기때문에 new 사용 X
        PrintWriter out = resp.getWriter();

        // 응답 body에 데이터 출력
        out.write("<h1>로그인</h1>");
    }
}