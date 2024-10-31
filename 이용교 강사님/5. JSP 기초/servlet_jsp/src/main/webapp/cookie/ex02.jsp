<%@ page contentType='test/html; charset=UTF-8' %>

<%
    Cookie[] cookies = request.getCookies();

    // 향상된 for문
    for (Cookie cookie : cookies) {
        System.out.printf("name = %s, value = %s%n", cookie.getName(), cookie.getValue());
    }
%>