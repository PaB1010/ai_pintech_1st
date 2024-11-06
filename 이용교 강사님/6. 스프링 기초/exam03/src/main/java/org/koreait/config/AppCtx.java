package org.koreait.config;

import org.koreait.exam04.Calculator;
import org.koreait.exam04.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

import javax.swing.*;

@Configuration
/*
@EnableAspectJAutoProxy = SpringProxy를 자동 설정하는 Proxy

서브클래스 기반의 proxy 변환
JAVA 표준은 Interface 기반의 proxy
Spring 쪽에는 기능을 확장해서 서브클래스 기반 proxy도 구현

@EnableAspectJAutoProxy(proxyTargetClass = true)
*/
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public SpringCachedCalculator springCachedCalculator() {

        return new SpringCachedCalculator();
    }

    @Bean
    public SpringProxyCalculator springProxyCalculator() {
        return new SpringProxyCalculator();
    }

    // 표준 proxy
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

    /*
    서브클래스 기반의 proxy
    @Bean
    public RecCalculator calculator() {
        return new RecCalculator();
    }
     */
}