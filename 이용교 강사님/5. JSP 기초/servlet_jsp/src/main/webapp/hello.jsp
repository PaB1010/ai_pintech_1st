<%@ page contentType="text/html; charset=UTF-8" %>
<h1>안녕하세요</h1>
<h2>번역 위치 _jspService() 메서드 내부에 주로 번역</h2>

<% // 스크립틀릿 태그 -> _jspService 내부에 번역
    System.out.println(request);
    // org.apache.catalina.connector.RequestFacade@33b1cf73
    // RequestFacade(구현체)

    System.out.println(response);
    // org.apache.catalina.connector.ResponseFacade@5efe9a69
    // ResponseFacade(구현체)

    String value = request.getParameter("key1");
    System.out.println(value);
    // URL에 queryString 추가 ?key1=값1
    // 값1
%>

<%
    int num1 = 100;
%>