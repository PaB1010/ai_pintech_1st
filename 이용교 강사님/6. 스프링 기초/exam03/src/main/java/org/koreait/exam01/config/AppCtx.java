// Bean Life 사이클 확인용

package org.koreait.exam01.config;

import org.koreait.exam01.Message;
import org.koreait.exam01.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {

    @Bean
    public Message message() {
        return new Message();
    }

    // @Scope("singleton") 기본 값은 singleton
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }
}