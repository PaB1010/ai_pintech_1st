// 1. 어떤 숫자를 넣으면 홀수인지 짝수인지 돌려주는 함수

function oddEven(x) {
  return x % 2 == 1 ? "홀수" : "짝수";
}

// 2. 어떤 숫자를 넣었을때 5의 배수이면 "5의 배수" 5의 배수가 아니면 "5의 배수 아님" 해주는 함수

function isFiveTime(x) {
  return x % 5 == 0 ? "5의 배수" : "5의 배수 아님";
}

// 3. 어떤 숫자를 넣으면 1 - 일반 팝콘, 2 - 캬라멜 팝콘, 3 - 치즈 팝콘, 그외 그런거 없음 해주는 함수

//Input, Output이 모두 존재(String)
function popcorn(x) {
  if (x == 1) {
    return "일반 팝콘";
  } else if (x == 2) {
    return "캬라멜 팝콘";
  } else if (x == 3) {
    return "치즈 팝콘";
  } else {
    return "없는 메뉴입니다";
  }
}

//위의 popcorn 코드를 간략화!
function popcorn3(x) {
  const menu = {
    1: "일반 팝콘",
    2: "캬라멜 팝콘",
    3: "치즈 팝콘",
  };
  return menu[x] || "없는 메뉴입니다";
}

function popcorn2(x) {
  return `${x} 팝콘`;
}

const myPopcorn = popcorn(2);
console.log(myPopcorn);

// Input만 있고 Output(return)이 없음, 계산만이 아니라 출력까지 -> 함수의 순수성에 위배(함수 안에 console문 금지!)
// function popcorn1(x) {
//   if (x == 1) {
//     console.log("일반 팝콘");
//   } else if (x == 2) {
//     console.log("캬라멜 팝콘");
//   } else if (x == 3) {
//     console.log("치즈 팝콘");
//   } else {
//     console.log("없는 메뉴입니다");
//   }
// }

// 4. 어떠한 문자열을 3개 넣으면 배열로 돌려주는 함수 ex) 사탕, 떡볶이, 멜론 -> [사탕, 떡볶이, 멜론]

function stringToArray(a, b, c) {
  return [a, b, c];
}

// 5. 어떠한 과일 이름을 넣으면 ~~맛 아이스크림을 돌려주는 함수
function fruit(x) {
  return `${x}맛 아이스크림`;
}

const a = fruit("민트");
console.log(a); // 민트맛 아이스크림 출력

// 6. 세가지 맛을 입력하면 배열로 돌려주는 함수
function fruitArray(a, b, c) {
  return [a, b, c];
}

// 7. 홀수true 짝수 false 함수
function oddEven1(x) {
  return x % 2 == 1;
}
