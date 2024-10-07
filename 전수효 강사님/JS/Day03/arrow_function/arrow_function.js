// General Function [일반 함수, (구)문법]
function add(x, y) {
  return x + y;
}

function subtract(x, y) {
  return x - y;
}

// Arrow Function [신문법]
// () => {}
const add1 = (x, y) => {
  return x + y;
};

const subtract1 = (x, y) => {
  return x - y;
};

// Arrow Function 응용 퀴즈
// ~~과일 넣으면 ~~맛 아이스크림 리턴해주는 함수
const icecream = (fruit) => {
  return `${fruit}맛 아이스크림`;
};

// 문자 3개 넣으면 배열로 돌려주는 함수
const makeArr = (a, b, c) => {
  return [a, b, c];
};

// 숫자를 넣으면 홀수인지 짝수인지 알려주는 함수
const oddEven = (num) => {
  return num % 2 == 1 ? "홀수" : "짝수";
};
