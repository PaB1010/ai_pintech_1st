// 상속 & protected

package exam04;

import exam03.A;

public class C extends A {

        public void methodC() {

            // num3은 private라 접근 불가
            // num3 = 100;

            // num4는 상속한 protected라서 접근 가능
            num4 = 200;
        }
    }

