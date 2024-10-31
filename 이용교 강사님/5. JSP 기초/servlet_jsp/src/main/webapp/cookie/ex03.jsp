<%@ page contentType='text/html; charset=UTF-8' %>

<%
    Cookie cookie = new Cookie("key4", "value4");

    // 일주일을 초단위로 설정
    // cookie.setMaxAge(604800);
    // 가독성 떨어짐

    // 관례상 60(초) * 60(분) * 24(시간) * x(원하는 일수)
    // 이렇게 설정
    cookie.setMaxAge(60 * 60 * 24 * 7);

    // Server에서만 Cookie 조회 가능하도록
    cookie.setHttpOnly(true);

    response.addCookie(cookie);
%>