// 회원 가입

package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// 추상 메서드 Servlet 상속
public class JoinController extends HttpServlet {


    // 회원 가입방식은 Server 데이터를 건드는 것이므로 get말고 post사용해야함
    /*
    // doGet 재정의
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 요청 데이터 조회 getParameter()
        String key1 = req.getParameter("key1");
        String key2 = req.getParameter("key2");

        System.out.printf("key1 = %s%n", key1);
        System.out.printf("key2 = %s%n", key2);
        // http://localhost:3000/servlet_jsp/member/join?key1=값&key2=값2
        // key1 = 값
        // key2 = 값2
    }
     */

    // Post방식으로 알맞게 다시 재정의하기
    // 기본 접근제어자 protected인데 public으로 변경
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // body가 있으니 ContentType필수!!
        resp.setContentType("text/html; charset=UTF-8");

        // 문자 형태로 한글 깨지지 않게
        PrintWriter out = resp.getWriter();

        // 작성
        // 작성 양식시 무조건 form 태그!!
        // method = 요청 방식
        // -> 회원 가입은 서버에 영구적인 영향이므로 POST
        // action = 제출처
        out.write("<form method='POST' action='join'>");

        // input = Name & Value
        // 지금은 Value값 입력 없이 Name만 입력
        out.write("이메일 : <input type='text' name='email'><br>");
        out.write("비밀번호 : <input type='password' name='password'><br>");
        out.write("비밀번호 확인 : <input type='password' name='confirmPassword'><br>");
        out.write("회원명 : <input type='text' name='userName'><br>");
        out.write("<button type='submit'>가입하기</button>");
        out.write("</form>");
    }

    // 기본 접근제어자 protected인데 public으로 변경
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
