/*Annotation 정의

Annotation 정의시 필수 요소
1. 적용 범위(@Target - 그때그때 알맞게) 2. 적용 시기 (@Retention - Runtime 고정)

 */

package org.koreait.global.configs;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ManualBean {


}
