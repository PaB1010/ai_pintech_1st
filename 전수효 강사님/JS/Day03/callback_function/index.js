// Callback Function (함수 안에 함수 넣기 = 추상화, 코드 간략화)

// 함수 : 마술상자 (Input과 Output 존재)
// f(x) = x + 1;
// 마라, 크림 -> 마라떡볶이/크림떡볶이

// f(g(x)) : 함수 안의 함수
// 요리법(마라탕) -> 음식

const cook = (recipe) => {
  console.log("요리 시작!");
  recipe();
  console.log("요리 완료!");
};

const taco = () => {
  console.log("살사소스 준비");
  console.log("나초칩");
  console.log("난 준비");
  console.log("고기 올리기");
  console.log("타코 완성");
};

const ramen = () => {
  console.log("물 끓이기");
  console.log("면 넣기");
  console.log("스프 넣기");
  console.log("계란 넣기");
};

cook(ramen);
cook(taco);

const skill = (magic) => {
  console.log("스킬 사용");
  magic();
  console.log("스킬 사용 완료");
};

const fire = () => {
  console.log("불 마법 사용");
};

const ice = () => {
  console.log("얼음 마법 사용");
};

const tree = () => {
  console.log("나무 변환 마법 사용");
};

skill(fire);
skill(ice);
skill(tree);
