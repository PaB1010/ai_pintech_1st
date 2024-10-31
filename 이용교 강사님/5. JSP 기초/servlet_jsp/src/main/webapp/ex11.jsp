<%@ page contentType="text/html; charset=UTF-8" %>

<%
    // pageContext 범위
    pageContext.setAttribute("test1", "테스트1");
    pageContext.setAttribute("test2", "테스트2");

    // request는 공유
    request.setAttribute("test3", "테스트3");
    request.setAttribute("test4", "테스트4");
%>

<jsp:include page="ex12.jsp" />

<%
    String test1 = (String)pageContext.getAttribute("test1");
    String test2 = (String)pageContext.getAttribute("test2");

    String test3 = (String)request.getAttribute("test3");
    String test4 = (String)request.getAttribute("test4");
%>

<h1>ex11.jsp</h1>
test1=<%=test1%>, test2=<%=test2%>