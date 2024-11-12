package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@Import(ControllerConfig.class)
public class MvcConfig implements WebMvcConfigurer {

    // 후순위 정적 경로 설정을 활성화하는 메서드
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();

        /*
            1. 요청 주소가 유입 되었을때
            2. HandlerMapping이 Controller Bean을 검색
            3. 못 찾으면 후순위로 css / js / 정적 웹페이지(html) / 이미지 등으로 정적인 경로를 검색
            
            resouces/static에 정적 경로 설정했음
         */
    }

    /*
        정적 경로 설정하는 메서드
        1. HandlereMapping이 Controller Bean을 찾지 못하면 체크해 보는 경로 설정
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // Ant패턴 -> 하위 dir포함한 모든 경로
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");
    }
}