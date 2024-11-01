// 설정 클래스

package org.koriait.exam01.config;

import org.koriait.exam01.Greeter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring 컨테이너가 관리할 객체의 설정 클래스임을 알려주는 Annotation
@Configuration
public class AppCtx {

    // Spring 컨테이너가 관리할 객체임을 알려주는 Annotation
    @Bean
    // 메서드를 호출하면 내부에서 객체를 생성하도록
    public Greeter greeter() {
        return new Greeter();
    }
}