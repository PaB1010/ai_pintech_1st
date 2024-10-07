// 1. [10,20,30,40,50]을 30이하면 +100, 아니면 +200
const num = [10, 20, 30, 40, 50];

num.map((x) => {
  return x <= 30 ? x + 100 : x + 200;
});

// 2. ["americano", "latte", "vanilla", "mocha", "mint", "tea"]
//      -1. 5글자 이하는 대문자, 아니면 '☕'로 바꾸기
const coffee = ["americano", "latte", "vanilla", "mocha", "mint", "tea"];

coffee.map((x) => {
  return x.length <= 5 ? x.toUpperCase : "☕";
});

// 위의 코드 간략화
coffee.map((x) => (x.length <= 5 ? x.toUpperCase : "☕"));

// function 간략화
const add = (x, y) => {
  return x + y;
};

// function 더 간략화, {} 안에 return 한줄만 있을때
const sub = (x, y) => x - y;

// return만 있는게 아니라 간략화 불가능
const mul = (x, y) => {
  const a = "123"; // 얘가 없으면 간략화 가능
  return x * y;
};

const a = [
  { name: "abc", age: 20 },
  { name: "bbc", age: 22 },
];
// a는 배열, a[0]은 오브젝트, a[0].name은 문자 a[0].age는 숫자
