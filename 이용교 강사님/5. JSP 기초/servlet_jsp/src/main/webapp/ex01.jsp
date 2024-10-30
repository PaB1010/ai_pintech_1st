<%@ page contentType='text/html; charset=UTF-8' %>

<% // _jspService() 내부에 번역

    // 지역 변수
    int num1 = 100;
    int num2 = 200;
    out.write(num1 + num2);
    // out.write("<h1>" + message + "</h1>");

    printMessage();

    // 함수 지역 내부이므로 함수 정의 불가능
%>

<%! // 선언문 태그

    // 인스턴스 변수
    // _jspService() 에서도 물론 접근 가능
    String message = "안녕하세요";

    // 인스턴스 메서드
    // 여기서는 Service 함수 지역 접근 불가하므로 out.write말고 println
    void printMessage() {
        System.out.println(message);
    }
%>