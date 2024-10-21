// JDK 4 이전의 Object 다형성 구문법

package exam03;

public class Box {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}