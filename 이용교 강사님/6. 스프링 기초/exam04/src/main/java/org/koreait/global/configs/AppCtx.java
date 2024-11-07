package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// 추가 config 있을 수 있어서 {}로 감쌈
@Import({DBConfig.class})
public class AppCtx {

}