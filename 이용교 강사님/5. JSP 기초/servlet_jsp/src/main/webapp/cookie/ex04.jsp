<%@ page contentType='text/html; charset=UTF-8' %>

<%
    Cookie cookie = new Cookie("key4", "value4");

    // Cookie 삭제
    // 0 = 1970.1.1 00:00:00
    cookie.setMaxAge(0);

    response.addCookie(cookie);
%>