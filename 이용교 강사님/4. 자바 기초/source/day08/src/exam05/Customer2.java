// 레코드 클래스 (데이터 클래스)

package exam05;

// () = 멤버 변수 초기화 값 정의
// 멤버 변수가 많을땐 Column 형식으로 기입
public record Customer2(int id,
                        String name,
                        String email)
{    // 메서드 정의 가능
    }