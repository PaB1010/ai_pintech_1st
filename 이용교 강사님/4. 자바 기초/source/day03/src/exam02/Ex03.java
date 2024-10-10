// 배열 선언과 동시에 초기화

package exam02;

public class Ex03 {
    public static void main(String[] args) {

        // 변수
        // int num; // 선언
        // num = 10; // 초기화
        // int num = 10; // 선언과 동시에 초기화

        // 배열
        // int[] nums = new int[] {10, 20, 30, 40}; // 선언과 동시에 초기화

        // new int[] -> 생략 가능
        int[] nums = {10, 20, 30, 40};

        // 선언과 초기화를 분리시 new int[] 생략 불가능
        // int[] nums;
        // nums = {10, 20, 30, 40};

        // new int[] 포함시 가능
        int[] nums2;
        nums2 = new int[] {10, 20, 30, 40};

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        }
    }
}