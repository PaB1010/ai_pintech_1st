<%@ page contentType='text/html; charset=UTF-8' %>


<%-- 번역시 Util import 추가 --%>
<%@ page import="java.util.*" %>
<%@ page import="java.time.*" %>
<%-- import java.util.*; --%>
<%-- import java.time.*; --%>

<%-- , 이용해 연달아 써도 가능 --%>
<%@ page import="java.util.function.*, java.util.stream.*" %>
<%-- import java.util.function.*;import java.util.stream.* --%>

<%@ page info="JSP 연습" %>

<%
    // _jspService 함수 지역 내부
    // List의 구현체인 Array 활용
    ArrayList<String> items = new ArrayList<>();
    items.add("항목1");
    items.add("항목2");
    items.add("항목3");
%>


<%-- 표현문 태그 (보통 출력) --%>
<%=items%>
<%-- out.print(items); --%>

<%
    LocalDateTime now = LocalDateTime.now();
%>

<h1><%=now%></h1>

<h1><%=getServletInfo()%></h1>