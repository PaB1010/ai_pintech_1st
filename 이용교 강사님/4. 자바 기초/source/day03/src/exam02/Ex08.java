// 다차원 배열 (2차원 배열) 선언 & 초기화 & .length & 중첩 for문

package exam02;

public class Ex08 {
    public static void main(String[] args) {

        // 배열 선언
        // 2차원 배열 2행 3열
        int[][] nums = new int[2][3];

        // 배열의 시작 지점 주소
        System.out.println(nums);

        // 배열 초기화

        // 0행
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        // 1행
        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;

        // 선언과 동시에 초기화
        int[][] nums2 = new int [][] {
                {10, 20, 30},
                {40, 50, 60}
        };

        // new int [][] 생략 가능
        // {10, 20, 30}, {40, 50, 60} 두개의 일차원 배열로 구성
        int[][] nums3 = {{10, 20, 30}, {40, 50, 60}};

        // 행의 개수가 나옴 -> 2
        System.out.printf("nums3.length = %d%n", nums3.length);

        // 열의 개수가 나옴 -> 3
        System.out.printf("nums3[0].length = %d%n", nums3[0].length);

        // 2차원 배열 nums3의 0행의 주소를 복사한 1차원 배열 nums4
        int[] nums4 = nums3[0];
        nums4[1] = 22;
        // nums3의 0행 1열 22으로 대입 변경

        System.out.println(nums4 == nums3[0]);
        // 같은 주소니까 true

        for (int i = 0; i < nums3.length; i++) { // 0행, 1행

            for (int j = 0; j < nums3[i].length; j++) { // 0열, 1열, 2열

                System.out.printf("%d행, %d열 = %d%n", i, j, nums3[i][j]);
            }
        }
    }
}