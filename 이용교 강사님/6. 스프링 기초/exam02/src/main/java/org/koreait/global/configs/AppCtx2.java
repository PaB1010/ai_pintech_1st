package org.koreait.global.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
public class AppCtx2 {


    // 날짜 출력 형식 바꾸는
    @Bean
    public DateTimeFormatter dateTimeFormatter() {

        return DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss:ms");
    }
}
