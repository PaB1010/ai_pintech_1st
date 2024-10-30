<%@ page contentType='text/html; charset=UTF-8' %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:forEach var="i" begin="1" end="10">

<h1>반복 ${i}</h1>

</c:forEach>

<%
    // JAVA 주석 입니다!
    // JAVA 주석으로 번역됨
    // 컴파일 시 배제
%>

<%--
    JSP 주석입니다!
    JSP가 Servlet 클래스로 번역될때 배제
    _jsp.java에 코드 없음
--%>