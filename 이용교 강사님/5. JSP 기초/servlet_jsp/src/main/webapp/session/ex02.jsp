<%@ page contentType='text/html; charset=UTF-8' %>

<%
    // Session은 Object이므로 형변환 필수
    String SsKey1 = (String)session.getAttribute("SessionKey1");
    String SsKey2 = (String)session.getAttribute("SessionKey2");
%>

key1=<%=SsKey1%>, key2=<%=SsKey2%>