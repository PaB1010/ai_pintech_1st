// makeCoffee 라는 함수를 만들고 시작과 끝에 "커피 준비", "커피 준비 완료"
// americano, latte, vanilla 함수 만들어서
// makeCoffe(americano) 하면 "커피 준비" "아메리카노 레시피" "커피 준비 완료"
// 실행해서 결과 출력까지

const makeCoffee = (recipe) => {
  console.log("커피 준비 시작");
  recipe();
  console.log("커피 준비 완료");
};

const americano = () => {
  console.log("에스프레소를 내린다");
  console.log("물을 붓는다");
};

const latte = () => {
  console.log("에스프레소를 내린다");
  console.log("우유를 붓는다");
};

const vanilla = () => {
  console.log("에스프레소를 내린다");
  console.log("우유를 붓는다");
  console.log("바닐라 시럽을 섞는다");
};

makeCoffee(americano);
makeCoffee(latte);
makeCoffee(vanilla);

// 매개 변수의 이름을 모를때
makeCoffee(() => {
  console.log("에스프레소를 내린다");
  console.log("물을 붓는다");
  console.log("망고를 넣는다");
});
