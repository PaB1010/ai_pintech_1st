// 배열 시작 지점 주소 심화

package exam02;

public class Ex04 {
    public static void main(String[] args) {

        int[] nums1 = {10, 20, 30, 40};

        int[] nums2 = nums1;

        nums2[1] = 22;
        // 이때는 nums1[1], nums2[1] 모두 22

        nums1[1] = 24;
        // 이때는 nums1[1], nums2[1] 모두 24

        nums2[1] = 23;
        // 이때는 nums1[1], nums2[1] 모두 23

        System.out.println(nums1[1]);
        // 23 대입 연산이 더 나중으로 있기때문에
        // 23 출력

        System.out.println(nums2[1]);
        // 위와 주소값이 같으므로 23
    }
}