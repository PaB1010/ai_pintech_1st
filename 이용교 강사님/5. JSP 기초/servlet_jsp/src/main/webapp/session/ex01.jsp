<%@ page  contentType='text/html; charset=UTF-8' %>

<%
    // 이미 jsp 내장객체로 getSession 했기때문에 안가져와도 됨
    // HttpSession session = request.getSession();

    // Session 객체 설정 등록
    session.setAttribute("SessionKey1", "SessionValue1");
    session.setAttribute("SessionKey2", "SessionValue2");
%>