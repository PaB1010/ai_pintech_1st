package org.koreait.tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.RequestJoin;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class Ex01 {

    private ObjectMapper om;

    private RestTemplate restTemplate;

    @BeforeEach
    void init() {

        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        restTemplate = new RestTemplate();
    }

    @Test
    @DisplayName("ObjectMapper - JAVA 객체 <-> JSON 문자열 변환")
    void test1() throws Exception {

        RequestJoin form = new RequestJoin();

        form.setEmail("user01@test.org");
        form.setPassword("123456");
        form.setConfirmPassword("123456");
        form.setName("사용자01");

        // JAVA 객체 -> JSON 문자열 변환
        String json = om.writeValueAsString(form);

        System.out.println("form1 : " + json);

        // JSON 문자열 -> JAVA 객체 변환
        RequestJoin form2 = om.readValue(json, RequestJoin.class);
        // 단일 클래스 형태의 자료형으로 변환시 Class 클래스 객체가 두번째 매개변수

        System.out.println("form2 : " + form2);
    }

    @Test
    @DisplayName("ObjectMapper - Collection 활용")
    void test2() throws Exception {

        List<RequestJoin> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> RequestJoin.builder()
                        .email("user" + i + "@test.org")
                        .password("1234")
                        .confirmPassword("1234")
                        .name("사용자" + i).build()).toList();

        // List -> JSON 문자열
        String json = om.writeValueAsString(items);

        System.out.println("json : " + json);

        // JSON 문자열 -> List<T>, Map<K, V>, Set<...> 등등 복합적 Collection 으로 변환 시에는
        // TypeReference (추상 클래스) 객체 필요
        // List<RequestJoin> items2 = om.readValue(json, new TypeReference<List<RequestJoin>>() {});
        List<RequestJoin> items2 = om.readValue(json, new TypeReference<>() {});

        items2.forEach(System.out::println);
    }

    @Test
    @DisplayName("UriComponents")
    void test3() throws Exception {

        // UriComponents url = UriComponentsBuilder.fromUri(URI.create("https://www.naver.com"))

        UriComponents url = UriComponentsBuilder.fromUriString("www.naver.com")
                .queryParam("k1", "v1") // queryString
                .queryParam("k2", "v2") // queryString
                .queryParam("k3", "한글") // queryString
                .fragment("header") // hash
                .encode() // Multibyte 문자 -> 16진수 형태로 변경 - URL 인코딩
                .build();

        String _url = url.toString();

        System.out.println(_url);
        // www.naver.com?k1=v1&k2=v2#header
    }

    @Test
    @DisplayName("restTemplate - getForObject()")
    void test4() {

        String url = "https://jsonplaceholder.typicode.com/posts/1";

        // 응답 Body Data
        // 문자열로 가져오려면 String.class
        // String body = restTemplate.getForObject(URI.create(url), String.class);

        // Body Data -> Post.class 형태로 자동 변환
        Post body = restTemplate.getForObject(url, Post.class);

        System.out.println(body);
    }

    @Test
    @DisplayName("restTemplate - getForEntity()")
    void test5() {

        String url = "https://jsonplaceholder.typicode.com/posts/1";

        // 응답 header & body
        // <String> = Body Data 형식
        // ResponseEntity<String> response = restTemplate.getForEntity(URI.create(url), String.class);
        // System.out.println(response);

        ResponseEntity<Post> response = restTemplate.getForEntity(URI.create(url), Post.class);

        // 응답 상태 코드
        HttpStatusCode statusCode = response.getStatusCode();
        System.out.println("status : " + statusCode);

        // 응답 header
        HttpHeaders headers = response.getHeaders();
        System.out.println("headers : " + headers);

        // 응답 Body
        System.out.println("body : " + response.getBody());
    }
}