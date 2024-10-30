package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 요청 처리전 필터링
        System.out.println("MyFilter2 - 요청 전");

        chain.doFilter(request,response);

        // 응답 후 필터링
        System.out.println("MyFilter2 - 응답 후");
    }
}