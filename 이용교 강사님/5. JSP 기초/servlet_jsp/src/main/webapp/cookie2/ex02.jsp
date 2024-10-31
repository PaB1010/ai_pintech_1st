<%@ page contentType='text/html; charsete=UTF-8' %>

<%
    Cookie cookie = new Cookie("key3", "value3");
    // cookie.setPath("/servlet_jsp");
    cookie.setPath(request.getContextPath());

    response.addCookie(cookie);
%>