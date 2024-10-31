<%@ page contentType='text/html; charsete=UTF-8' %>

<%
    Cookie cookies = new Cookie("key2", "value2");

    response.addCookie(cookies);
%>