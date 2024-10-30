// Wrapper Class

package org.koreait.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

// 상위 클래스에 기본 생성자가 없기때문에 오류뜸
public class CommonRequestWrapper extends HttpServletRequestWrapper {

    // 생성자
    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);

        // 요청시 공통 코드 여기에 정의
        System.out.println("요청 공통 코드 처리");
    }

    /*
    // 말도 안되는 기본 기능 재정의(예시용)
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);

        // 값이 없고 && 비어있을때 처리
        if (value != null && !value.isBlank()) {

            value = String.format("** %s **,", value);
        }
        return value;
    }
     */


}