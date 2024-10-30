// Filter interface

package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {

    @Override
    // httpServletRequest & httpServletResponse의 상위 클래스인 ServletRequest & ServletResponse가 매개변수
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 요청 처리 전 -> 요청 데이터 필터링
        // doFilter 메서드 전
        System.out.println("MyFilter1 - 요청 전");

        // doFilter = 다음 filter가 있으면 다음 filter 호출
        // 단 request & response 객체를 전달하며 호출
        // 다음 filter가 없으면 Servlet쪽에 정의된
        // 요청메서드(doGet(..) & doPost(..)) 호출
        chain.doFilter(request,response);

        // 응답 후에 필터링
        // doFilter 메서드 후
        System.out.println("MyFilter1 - 응답 후");
    }
}