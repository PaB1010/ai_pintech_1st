<%@ page contentType='text/html; charset=UTF-8' %>

<%
    // SessionKey1만 삭제
    // session.removeAttribute("SessionKey1");

    // Session 전체 비우기 (보통 로그아웃 구현시)
    session.invalidate();
%>