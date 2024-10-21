// List 활용 제너릭 클래스 정의

package exam05;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {

    // 여러개를 담을 List<T> 생성
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}