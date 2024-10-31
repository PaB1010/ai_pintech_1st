<%@ page contentType="text/html; charset=UTF-8" %>

<%
    // 값이 null으로 출력될 것
    String test1 = (String)pageContext.getAttribute("test1");
    String test2 = (String)pageContext.getAttribute("test2");

    String test3 = (String)request.getAttribute("test3");
    String test4 = (String)request.getAttribute("test4");
%>

<h1>ex12.jsp</h1>
test1=<%=test1%>, test2=<%=test2%>, test3=<%=test3%>, test4=<%=test4%>