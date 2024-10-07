//1. 출생년도를 물어보고 2005년이하면
//   성인입니다, 아니면 미성년자입니다.
const year = Number(prompt("몇년생?"));
const msg = year <= 2005 ? "성인입니다." : "미성년자입니다.";
console.log(msg);

//2.놀이기구를 탈려고 키를 물었음
//  150cm이하면 탈수없습니다. 아니면 탈수있습니다.
const height = Number(prompt("키몇?"));
const msg1 = height <= 150 ? "탈수없습니다. ㅅㄱ" : "탈수있습니다.";
console.log(msg);

//3. 양의 정수를 입력받고, 분초를 바꾸는 프로그램
//ex) 76, 201
const num = Number(prompt("양의 정수 입력"));
const sec = num % 60; // 16초
const min = parseInt(num / 60); // 3분
console.log(`${min}분 ${sec}초`);
