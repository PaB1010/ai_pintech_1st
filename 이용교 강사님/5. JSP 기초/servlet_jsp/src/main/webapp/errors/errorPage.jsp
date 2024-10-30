<%@ page contentType='text/html; charset=UTF-8' %>
<%@ page isErrorPage="true" %>

<h1>에러 발생!!</h1>

<%
    out.write("<h1>" + exception.getMessage() + "</h1>");

    // 콘솔에 문제 정보 출력
    exception.printStackTrace();
%>