<%@ page contentType='text/html; charset=UTF-8' %>

Cookie : ${header.Cookie}<br>

<%-- 변수명에 -가 들어가면 안돼서 불가
User-Agent : ${header.User-Agent}

['대괄호']로 감싸서 해결 --%>
User-Agent : ${header['User-Agent']}<br>

<%-- toString cookie 값이 나옴 즉 cookie 객체의 주소값 --%>
JSESSIONID : ${cookie.JSESSIONID}<br>

<%--
JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>

EL식이니까 get() 생략 하기 --%>
JSESSIONID : ${cookie.JSESSIONID.value}<br>

<%-- web.xml의 context-param 조회 --%>
initParam.key1 : ${initParam.key1}<br>

initParam.key2 : ${initParam.key2}<br>

<%-- pageContext 객체를 이용한 속성 정보 조회
.request.는 get 생략된 것
-> getRequest().
--%>

RequestURI : ${pageContext.request.requestURI}<br>