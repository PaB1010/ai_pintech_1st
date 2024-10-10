// 향산된 for문과 .length로 전체 출력

package exam02;

public class Ex07 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60};

        int[] nums2 = {10, 20, 30, 40, 50, 60};

        int nums2Length = nums2.length;

        // 배열 공간의 개수
        System.out.printf("nums2 length=%d%n", nums2.length);

//        for (int i = 0; i <= 6; i++) {
//            System.out.println(nums[i]);
//            // nums[6]은 없기때문에 nums[5]인 50까지 출력되고
//            // 오류 발생
//        }

        // 관례적 문법
        // i < nums2.length 해도 정상 출력
        for (int i = 0; i < nums2Length; i++) {
            System.out.println(nums2[i]);
        }

        // 향상된 for문
        // nums2 배열 값 처음부터 끝까지 출력
        for (int num : nums2) {
            System.out.println(num);
        }
    }
}