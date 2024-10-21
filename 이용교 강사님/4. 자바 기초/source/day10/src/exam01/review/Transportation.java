// Enum 클래스 = 추상 클래스

package exam01.review;

public enum Transportation {

    // 추상 메서드 멤버 변수로 구현
    SUBWAY("지하철") {
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    BUS("버스") {
        @Override
        public int getTotal(int person) {
            return 1400 * person;
        }
    },
    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return 4000 * person;
        }
    };

    // 기본 생성자에 public 사용 불가로 오류
    // public Transportation() {}

    // Enum 클래스의 특성(상수)을 살리기 위해
    // 관례적으로 멤버 변수도 상수로 정의
    private final String title;
    
    // 보이지않는 private
    // 기본 생성자보다는 자체적으로 메서드 역할?
    Transportation(String title) {
        
        // 멤버 변수 초기화
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    // 추상 메서드
    public abstract int getTotal(int person);
}