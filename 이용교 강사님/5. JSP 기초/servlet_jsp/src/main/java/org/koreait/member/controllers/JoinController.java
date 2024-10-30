// 회원 가입

package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

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

        // 이러면 바로 value값 설정됨
        // out.write("이메일 : <input type='text' name='email' value='아이디@naver.com'><br>");

        out.write("비밀번호 : <input type='password' name='password'><br>");
        out.write("비밀번호 확인 : <input type='password' name='confirmPassword'><br>");
        out.write("회원명 : <input type='text' name='userName'><br>");

        // formTag : check box = 여러개중 여러개 입력 받기 적합
        out.write("취미 : <label><input type='checkbox' name='hobby' value='취미1'>취미1</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미2'>취미2</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미3'>취미3</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미4'>취미4</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미5'>취미5</label><br>");

        out.write("<button type='submit'>가입하기</button>");
        out.write("</form>");
    }

    // 기본 접근제어자 protected인데 public으로 변경
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Servlet 4버전까지는 인코딩 처리 필수
        // 기본 인코딩이 IS08859_1 - 2바이트 유니코드
        // Servlet 6버전부터는 기본 인코딩 UTF-8이라 생략 가능
        // req.setCharacterEncoding("UTF-8");

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");

        // getParameter = hobby로 요청한 값이 여러개더라도 처음 1개만 출력
        String hobby = req.getParameter("hobby");
        // 취미 1

        System.out.printf("email : %s / password : %s / confirmPassword : %s / username : %s / hobby : %s%n", email, password, confirmPassword, userName, hobby);

        // hobby라는 이름은 여러개의 데이터이므로 배열로 가져옴
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));
        // [취미1, 취미2, 취미3, 취미4, 취미5]
    }
}
