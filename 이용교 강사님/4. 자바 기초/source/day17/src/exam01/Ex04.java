// Arrays.equlas & Arrays.deepEqulas (배열 & 다차원 배열 비교)
// Arrays.toString & Arrays.deepToString (배열 & 다차원 값 출력)

package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};

        boolean isSame = Arrays.equals(nums1, nums2);

        System.out.println(isSame);
        // true
        
        System.out.println("nums1 : " + nums1);
        // 주소값 출력
        // nums1 : [I@682a0b20
        
        System.out.println("nums1 : " + Arrays.toString(nums1));
        // 값 출력
        // nums1 : [1, 2, 3, 4, 5, 6]

        int[][] nums3 = {{1,2,3}, {4,5,6}};
        int[][] nums4 = {{1,2,3}, {4,5,6}};

        boolean isSame2 = Arrays.deepEquals(nums3, nums4);

        System.out.println(isSame2);
        // true

        System.out.println("nums3 : " + Arrays.toString(nums3));
        // 주소값 출력
        // nums3 : [[I@3d075dc0, [I@214c265e]

        System.out.println("nums3 : " + Arrays.deepToString(nums3));
        // 값 출력
        // nums3 : [[1, 2, 3], [4, 5, 6]]
    }
}