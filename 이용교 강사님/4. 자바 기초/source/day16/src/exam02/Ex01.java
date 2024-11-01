// HashMap

package exam02;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {

        Map<String, String> members = new HashMap<>();

        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");
        members.put("user05", "사용자05");

        members.put("user01", "사용자99");

        //IfAbsent(Key값이 이미 있다면 put하지 않음)
        members.putIfAbsent("user01", "사용자98");

        // toString 재정의 되어있음
        System.out.println(members);
        // {user04=사용자04, user03=사용자03, user02=사용자02, user01=사용자99, user05=사용자05}

        // key=user02 제거
        members.remove("user02");

        // Key로 가져올 수 있음
        // remove전에 미리 get하면 값 담김
        String userName02 = members.get("user02");

        System.out.println(userName02);
        // 사용자02
        // 제거후 null
    }
}