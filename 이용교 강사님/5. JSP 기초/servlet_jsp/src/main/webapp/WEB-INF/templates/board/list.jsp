<%@ page contentType='text/html; charset=UTF-8' %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<table border='1'>
    <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>내용</th>
            <th>작성자</th>
        </tr>
    </thead>

    <tbody>
         <c:forEach var="item" items="${items}">

         <%-- 주로 출력이라 자주 사용하는 getter가 생략되기 때문에 아래의 문법으로 축약해 사용 가능
            <tr>
                <td>${item.getSeq()}</td>
                <td>${item.getSubject()}</td>
                <td>${item.getContent()}</td>
                <td>${item.getPoster()}</td>
            </tr>
         --%>

         <tr>
            <td>${item.seq}</td>
            <td>${item.subject}</td>
            <td>${item.content}</td>
            <td>${item.poster}</td>
         </tr>

        </c:forEach>
    </tbody>
</table>

<%-- get() 제외하는 축약 연습 --%>
${pageContext.getRequest().getRequestURI()}<br>

${pageContext.request.requestURI}