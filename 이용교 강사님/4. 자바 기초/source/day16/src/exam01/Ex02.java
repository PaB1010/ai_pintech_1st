// Book 생성 후 forEach

package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {

        Set<Book> items = new HashSet<>();

        items.add(new Book(1000, "책1", "저자1", "출판사1"));

        // 중복
        items.add(new Book(1001, "책2", "저자2", "출판사2"));
        items.add(new Book(1001, "책2", "저자2", "출판사2"));


        items.add(new Book(1002, "책3", "저자3", "출판사3"));
        items.add(new Book(1003, "책4", "저자4", "출판사4"));
        items.add(new Book(1004, "책5", "저자5", "출판사5"));

        // forEach 람다식으로 모두 출력
        items.forEach(System.out::println);
        /*
        equals & hashCode 재정의 전
        중복 체크를 동등성 체크로 하는데 hashCode 값인 주소가 다르기때문에 중복 제거가 안됐음
        Book{isdn=1001, title='책2', author='저자2', publisher='출판사2'}
        Book{isdn=1002, title='책3', author='저자3', publisher='출판사3'}
        Book{isdn=1004, title='책5', author='저자5', publisher='출판사5'}
        Book{isdn=1003, title='책4', author='저자4', publisher='출판사4'}
        Book{isdn=1000, title='책1', author='저자1', publisher='출판사1'}
        Book{isdn=1001, title='책2', author='저자2', publisher='출판사2'}

        equals & hashCode 재정의 후
        Book{isdn=1002, title='책3', author='저자3', publisher='출판사3'}
        Book{isdn=1003, title='책4', author='저자4', publisher='출판사4'}
        Book{isdn=1000, title='책1', author='저자1', publisher='출판사1'}
        Book{isdn=1001, title='책2', author='저자2', publisher='출판사2'}
        Book{isdn=1004, title='책5', author='저자5', publisher='출판사5'}
         */
    }
}