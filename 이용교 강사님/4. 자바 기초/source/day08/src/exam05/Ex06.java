// Set<> 활용

package exam05;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {
    public static void main(String[] args) {

        // 집합 자료형 (중복 없음 = 동등시 중복 제거)
        Set<Customer> items = new HashSet<>();

        items.add(new Customer(1000, "김이름", "user01@test.org"));
        items.add(new Customer(1000, "김이름", "user01@test.org"));
        items.add(new Customer(1000, "김이름", "user01@test.org"));

        items.add(new Customer(2000, "이이름", "user02@test.org"));

        items.add(new Customer(3000, "최이름", "user03@test.org"));

        for (Customer item : items) {

            System.out.println(item);

        }

    }
}
