// prompt로 첫번째 숫자 입력
// prompt로 두번째 숫자 입력
// 콘솔로 두 수의 합은 ~~입니다.

// const first = prompt("첫 번째 숫자 입력"); //10
// const second = prompt("두 번째 숫자 입력"); // 20
// const sum = Number(first) + Number(second);
// console.log(`두 수의 합은 ${sum} 입니다.`);

// ask: prompt, answer:console
// 1. 한 변의 길이를 물어보고, 정사각형의 넓이와 둘레 알려주기
const side = Number(prompt("정사각형의 한 변의 길이 ㄱ: "));
console.log(`정사각형의 넓이는 ${side * side} 둘레는 ${side * 4} 입니다.`);

// 2. 밑변과 높이를 물어보고, 정삼각형의 넓이 구하기
const base = Number(prompt("정삼각형의 밑변의 길이 ㄱ:"));
const height = Number(prompt("정삼각형의 높이 길이 ㄱ:"));
console.log(`정삼각형의 넓이는 ${base * height * 0.5} 입니다.`);

// 3. 반지름을 물어보고, 원의 넓이와 둘레 구하기
const radius = Number(prompt("원의 반지름 입력:"));
console.log(
  `원의 넓이 ${3.14 * radius * radius}이고, 둘레 ${2 * 3.14 * radius}입니다.`
);

// 4. 출생년도를 물어보고 나이를 나타내기 ex) 몇년생임? 1995 -> 30
const year = Number(prompt("몇년생임?"));
console.log(`연세 ${2025 - year} 이시군요!`);

// 5. 일본여행 갈거임 그래서 100만원 환전하면 현재 환율로 엔화 나타내기
//   ex) 얼마 환전? 1000000 -> 107451
const won = Number(prompt("얼마 환전 할거임?"));
const currency = 0.1075;
console.log(`환전결과(엔화)는 ${currency * won} 입니다.`);
