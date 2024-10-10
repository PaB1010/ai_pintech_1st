package exam02;

public class Ex03 {
    public static void main(String[] args) {

        int rank = 4;

        switch (rank) {
            case 1: // rank == 1일 경우 실행
                System.out.println("금메달");
                break; // 실행 흐름 종료, 안쓰면 아래의 case들도 모두 실행됨
            case 2: // rank == 2일 경우 실행, 연산 시작 지점(매칭)
                System.out.println("은메달");
                break;
            case 3: // rank == 3일경우 실행
                System.out.println("동메달");
                break; // 마지막 case라 break 생략 가능
            default : // 모든 값에 매칭이 되지 않는 경우 실행 시점
                System.out.println("입상");
        }
    }
}
// 입상
