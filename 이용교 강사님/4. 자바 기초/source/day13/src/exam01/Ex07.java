// 매개변수 람다(Supplier)를 메서드 참조로 (Optional 활용)

package exam01;

import java.util.Optional;
import java.util.function.Supplier;

public class Ex07 {
    public static void main(String[] args) {
        // 값이 없으니 Book이라는 객체 생성 필요
        Optional<Book> opt = Optional.ofNullable(null);

        // 매개변수 람다식
        // 매개변수 X 반환값으로 새로운 객체
        Book book = opt.orElseGet(() -> new Book());

        // 람다를 메서드 참조
        Book book2 = opt.orElseGet(Book::new);

    }
}