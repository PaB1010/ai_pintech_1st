// 10L 연산하는 캐시를 추가한 계산기

package org.koreait.exam02;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculator implements Calculator{

    private Map<Long, Long> cache = new HashMap<>();

    private Calculator cal;

    public CachedCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {

        // 공통 기능
        if(cache.containsKey(num)) {
            System.out.println("캐시에 저장된 값 사용!");
            return cache.get(num);
        }

        long result = cal.factorial(num);
        // 핵심 기능 대신 수행

        cache.put(num, result);
        // 공통 기능
        System.out.println("캐시에 값을 저장!");

        return result;
    }
}