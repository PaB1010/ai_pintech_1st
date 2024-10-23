package org.koreait.product.controllers;

import org.koreait.global.BeanContainer;
import org.koreait.global.Controller;
import org.koreait.global.Router;
import org.koreait.global.libs.Utils;
import org.koreait.product.entities.Product;
import org.koreait.product.services.ProductSaveService;
import org.koreait.product.templates.ProductForm;

import java.util.Scanner;

/**
 * 상품 등록/수정 컨트롤러
 *
 */
public class ProductController extends Controller {

    public ProductController() {
       setPromptProcess(() -> {

           // ## 공통적으로 선 긋기 ##
           Utils.drawLine('-', 30);

           // ## 데이터 클래스 ##
           Scanner sc = Router.sc;
           Product item = new Product();

           // ## 함수형 인터페이스 3개(상품명 판매가 재고) 열린 개행 ##

           // 상품명
           String name = Utils.getString("상품명", "상품명을 입력하세요.");
           item.setName(name);

           // 판매가
           // ## 형식 숫자인지 검증 ##
           int price = Utils.getNumber("판매가", "판매가를 입력하세요.");
           item.setPrice(price);

           // 재고
           // ## 형식 숫자인지 검증
           // 재고 입력하지 않으면 입력 요청 문구 나오게 예외 ##
           int stock = Utils.getNumber("재고", "재고를 입력하세요.");
           item.setStock(stock);

           // 상품 정보 저장 처리
           // ## 처리할 수 있는 기능과 연결(중재)
           // 상품 추가 OR 수정
           // getBean(기능이기때문에 싱글톤으로 객체 생성) ##
           ProductSaveService saveService = BeanContainer.getBean(ProductSaveService.class);
           // ## save해서 상품 저장 ##
           saveService.save(item);

           System.out.println("상품이 저장되었습니다.");
           // 저장 이후에 상품 목록으로 페이지 이동

           // ## 작업 끝난후 다시 상품목록(List)으로 이동 시켜줌 ##
           Utils.loadController(ProductListController.class);
       });
    }

    // ##Controller에서 상속받은 추상 메서드들 오버라이딩
    // getPromptText 오버라이딩해 출력값 변경 ##
    @Override
    protected String getPromptText() {
        return "등록할 상품 정보를 입력하세요(메인 메뉴: M, 종료: Q).\n";
    }

    // ## 각 컨트롤러에 맞게 view 재정의 ##
    @Override
    public void view()  {
        Utils.loadTpl(ProductForm.class);
    }
}
