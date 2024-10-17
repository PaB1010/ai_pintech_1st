// 값을 담을 수 있는 데이터 클래스
// 반대로 값을 바꿀 필요가 없는건 VO(value object)
// toString() & equals() 재정의

package exam05;

import java.util.Objects;

// public class Customer extends java.lang.Object {
public class Customer {

    // 고객 번호
    private int id;
    // 고객명
    private String name;
    // 이메일
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /*
    @Override
    public String toString() {
    //    toString 기존 값
    //    return super.toString();
        return "id= " + id + ", name = " + name + ", email = " + email;
    }
     */

    // equlas() 재정의
    @Override
    public boolean equals(Object obj) {

        // 안전하게 형변환 하기 위해 체크후 바로 변환
        if (obj instanceof Customer customer) {

            // id, name, email의 값이 같으면 동등하다는 조건문
            if (id == customer.id && name.equals(customer.name) && email.equals(customer.email)) {

                return true;

            }

        }

        return false;
    }

    // hashCode() 재정의
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    // toString() 재정의
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}