<%@ page contentType='text/html; charset=UTF-8' %>

이메일 : ${param.email}<br>
비밀번호 : ${param.password}<br>
비밀번호 확인 : ${param.confirmPassword}<br>
회원명 : ${param.userName}<br>


<%-- 맨 앞 한개만 나오는 문제, paramValues 사용으로 해결
취미 : ${param.hobby}<br>
--%>

취미 : ${paramValues.hobby[0]},${paramValues.hobby[1]},${paramValues.hobby[2]},${paramValues.hobby[3]},${paramValues.hobby[4]}<br>