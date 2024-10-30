// init & destroy 메서드

package org.koreait.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

// @WebFilter
public class MyFilter3 implements Filter {

    @Override
    // init() -> 최초 객체생성시 1번만 호출
    public void init(FilterConfig filterConfig) throws ServletException {
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.printf("key1 : %s%n",key1);
        System.out.printf("key2 : %s%n",key2);
    }


    @Override
    // doFilter() -> 매 요청마다 호출
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 요청 처리전 공통 처리 부분
        System.out.println("MyFilter3 - 요청 전");
        // 요청 처리 전 공통 처리 코드 여기(doFilter 위) 정의 지양!!

        chain.doFilter(request,response);

        // 응답 후 공통 처리 부분
        System.out.println("MyFilter3 - 응답 후");
        // 응답 후 공통 처리 코드 여기(doFilter 아래) 정의 지양!!
    }


    @Override
    // destroy() -> 소멸 직전 단 1번 호출
    public void destroy() {
        System.out.println("MyFilter3 - destroy()");
    }
}