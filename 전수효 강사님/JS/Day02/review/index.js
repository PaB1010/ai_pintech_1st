const exe1 = prompt("첫 번째 운동");
const exe2 = prompt("두 번째 운동");
const exe3 = prompt("세 번째 운동");
console.log(`운동 순서:${exe1}->${exe2}->${exe3}`);

const price = Number(prompt("커피 가격 입력"));
const amount = Number(prompt("커피 수량 입력"));
console.log(`커피 총 가격: ${price * amount}`);

const year = Number(prompt("몇 년생이셈?"));
console.log(`${year}년생이니 나이는 ${2024 - year + 1}이군요!`);
