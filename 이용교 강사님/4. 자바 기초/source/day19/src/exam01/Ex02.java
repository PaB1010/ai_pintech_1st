// Optional 활용

package exam01;

import java.util.Optional;

public class Ex02 {
    public static void main(String[] args) {

        Book book = null;

        Optional<Book> opt = Optional.ofNullable(book);

        // 메서드 참조로 단축 가능 -> book4 참고
        Book book2 = opt.orElse(new Book());

        Book book3 = opt.orElseGet(() -> {
            Book b = new Book();
            b.setTitle("책1");
            b.setAuthor("저자1");
            return b;
        });

        // 메서드 참조
        Book book4 = opt.orElseGet(Book::new);

        System.out.println(book2);
        // Book{title='null', author='null'}

        System.out.println(book3);
        // Book{title='책1', author='저자1'}


        // book.setTitle("책1");
    }


}