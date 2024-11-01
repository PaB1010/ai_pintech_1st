// TreeSet (Ex04 코드 재활용)

package exam01;

import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {

        Set<Book> items = new TreeSet<>();

        items.add(new Book(1001, "책2", "저자2", "출판사2"));
        items.add(new Book(1002, "책3", "저자3", "출판사3"));
        items.add(new Book(1000, "책1", "저자1", "출판사1"));

        // 중복
        items.add(new Book(1001, "책2", "저자2", "출판사2"));

        items.add(new Book(1004, "책5", "저자5", "출판사5"));
        items.add(new Book(1003, "책4", "저자4", "출판사4"));

        // forEach 람다식으로 모두 출력
        items.forEach(System.out::println);
        /*
        isdn 오름차순 & 내림차순 정렬
        Book{isdn=1000, title='책1', author='저자1', publisher='출판사1'}
        Book{isdn=1001, title='책2', author='저자2', publisher='출판사2'}
        Book{isdn=1002, title='책3', author='저자3', publisher='출판사3'}
        Book{isdn=1003, title='책4', author='저자4', publisher='출판사4'}
        Book{isdn=1004, title='책5', author='저자5', publisher='출판사5'}
         */
    }
}