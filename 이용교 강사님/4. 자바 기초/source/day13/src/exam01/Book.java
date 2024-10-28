// 참조 변수로 메서드 참조 & this 메서드 참조

package exam01;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Book {

    private String title;


    public void test() {
        // 리턴값 없어서 Consumer
        // this를 메서드 참조
        Consumer<String> opr = (s) -> setTitle(s);
        Consumer<String> opr2 = this::setTitle;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {
        
        return title;
    }
}