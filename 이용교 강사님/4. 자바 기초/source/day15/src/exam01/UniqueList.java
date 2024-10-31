// 순서대로 추가 & 중복 불가한 리스트

package exam01;

import java.util.ArrayList;
import java.util.List;

public class UniqueList<E> {


    private List<E> items;

    public UniqueList() {
        this(10);
    }

    // 메서드 오버로드
    public UniqueList(int capcity) {
        items = new ArrayList<>(capcity);
    }

    // 포함되지 않았을 때만 추가 (중복 제거)
    public void add(E e) {
        if (!items.contains(e)) {
            items.add(e);
        }
    }

    public E get(int index) {
        return items.get(index);
    }

    @Override
    public String toString() {
        return "UniqueList{" +
                "items=" + items +
                '}';
    }
}