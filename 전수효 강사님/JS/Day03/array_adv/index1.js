// 배열 요소 바꾸기 함수
const addTen = (x) => {
  return x + 10;
};

const square = (x) => {
  return x ** x;
};

const num = [1, 2, 3, 4, 5].map(addTen);
const num1 = [1, 2, 3, 4, 5].map(square);
const num2 = [1, 2, 3, 4, 5].map((x) => {
  return x + 100;
});

console.log(num);
console.log(num1);
console.log(num2);
