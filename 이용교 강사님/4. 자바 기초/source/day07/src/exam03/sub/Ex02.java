// MouseAdapter 사용해 원하는 메서드(mouseClicked)만 사용

package exam03.sub;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex02 extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }
}