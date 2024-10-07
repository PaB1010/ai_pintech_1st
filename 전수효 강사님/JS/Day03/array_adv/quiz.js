// 1. [1,2,3,4,5] -> 두배 해주기

const x2 = (x) => {
  return x * 2;
};

// 2. [1,2,3,4,5] -> 홀수면 두배, 짝수면 세배

const holzak = (x) => {
  return x % 2 == 1 ? x * 2 : x * 3;
};

// 3. [1,2,3,4,5] -> 3이하면 🍒 아니면 🍉

const fruit = (x) => {
  return 3 >= x ? "🍒" : "🍉";
};

const num = [1, 2, 3, 4, 5].map(x2);
const num1 = [1, 2, 3, 4, 5].map(holzak);
const num2 = [1, 2, 3, 4, 5].map(fruit);

// console.log(num);
// console.log(num1);
// console.log(num2);

const fruitArray = [
  "watermelon",
  "cheery",
  "banana",
  "avocado",
  "apple",
  "orange",
  "pineapple",
  "strawberry",
];

// 1. 문자의 길이가 7글자 이상이면 대문자화 아니면 소문자화

// const up7pt = fruitArray.map((x) => {
//   return x.length > 6 ? x.toUpperCase() : x.toLowerCase();
// });

// const q1 = (x) => {
//   return x.length >= 7 ? x.touppercase() : x.tolowercase();
// };

// 2. 알파벳 a가 들어가면 대문자화 아니면 소문자화

// const hasA = fruitArray.map((x) => {
//   return x.includes("a") ? x.toUpperCase() : x.toLowerCase();
// });
// const q2 = (x) => {
//   return x.includes("a") ? x.touppercase() : x.tolowercase();
// };

// 3. 단어 안에 있는 알파벳 a를 🍒로 바꾸기

// const hasA2 = fruitArray.map((x) => {
//   return x.replaceAll("a", "🍒");
// });
// const q3 = (x) => {
//   return x.includes("a") ? x.replaceALL("a", "🍒") : x;
// };

// console.log(up7pt);
// console.log(hasA);
// console.log(hasA2);

const starbucks = [
  { name: "americano", price: 4500, shots: 2, ingredients: ["water", "beans"] },
  { name: "latte", price: 6000, shots: 2, ingredients: ["milk", "beans"] },
  {
    name: "java chip",
    price: 6500,
    shots: 2,
    ingredients: ["milk", "wheat", "beans"],
  },
  {
    name: "honey black tea",
    price: 5700,
    shots: 1,
    ingredients: ["grapefruit", "water", "source"],
  },
];

// 1. 가을 시즌 이벤트 -> 모든 가격을 10% 할인한 가격으로 변경(replace)
const event1 = starbucks.map((x) => {
  x.price = x.price * 0.9; // 숫자 type
  return x;
});

// 2. 두유시즌 이벤트 -> 성분에 두유 강제 추가
const event2 = starbucks.map((x) => {
  x.ingredients.push("soymilk"); // [] 함수
  return x;
});

// 3. 스타벅스 아아 기념 -> 이름이 아메리카노면 2000원 할인된 가격으로 변경하고 샷 1개 추가
const event3 = starbucks.map((x) => {
  //   x.name.includes("americano") ? x.price == x.price - 2000 : x;
  //   x.name.includes("americano") ? x.shots == x.shots + 1 : x;
  //   return x;

  if (x.name == "americano") {
    x.price = x.price * 0.8;
    x.shots = x.shots + 1;
    return x;
  } else {
    return x;
  }
});

// 4. 인플레이션 시즌 이벤트 -> 모든 가격 20% 상승
const event4 = starbucks.map((x) => {
  x.price = x.price * 1.2; // 숫자 type
  return x;
});

console.log(event1);
console.log(event2);
console.log(event3);
console.log(event4);
