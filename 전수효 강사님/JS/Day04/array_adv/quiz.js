// 1. [1,2,3,4,5,6,7,8,9,10] 중에 3의 배수만 살리기

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10].filter((x) => {
  return x / 3 == 0;
});

// 2. [1,2,3,4,5,6,7,8,9,10] 중에 4 이상 8이하만 만 살리기

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10].filter((x) => {
  return 4 <= x <= 8;
});

const fruitArray = [
  "watermelon",
  "cherry",
  "banana",
  "avocado",
  "apple",
  "orange",
  "pineapple",
  "strawberry",
];

// 3. 알파벳 o가 들어있는 요소만 살리기
const changeO = fruitArray.filter((x) => {
  return x.includes("o");
});

console.log(changeO);

// 4. 문자길이가 6글자 이상인 요소만 살리기
const change6 = fruitArray.filter((x) => {
  return x.length >= 6;
});

console.log(change6);

// 5. 문자길이가 짝수인 애들만 살리고, 대문자화 시키기
fruitArray
  .filter((x) => {
    return x.length % 2 == 0;
  })
  .map((x) => {
    return x.toUpperCase;
  });

// 6. 유저에게 정수 n(최대치,k(배수)를 입력 받으면
// 예를 들여 n = 10, k = 3 -> [3,6,9], n = 15, k = 5 -> [5,10,15]
// 를 도출하는 함수

// const n = prompt("최대치를 입력해주세요");
// const k = prompt("배수를 입력해주세요");

// 내가 한거
// const numArray(n)
//   .fill(0)
//   .map((x, i) => {
//     return i;
//   })
//   .filter((x) => {
//     return x % k == 0;
//   });

// 선생님 코드
const test = (n, k) => {
  return Array(n)
    .fill(0)
    .map((x, i) => {
      return i + 1;
    })
    .filter((x) => {
      return x % k == 0;
    });
};

// todolist = ["점심먹기","복습하기","유튜브시청","카톡하기"];
// finished = [false, false, true, true]; 일때
// newToDolist = ["점심먹기", "복습하기"]; 남도록 하는 코드

const todolist = ["점심먹기", "복습하기", "유튜브시청", "카톡하기"];
const finished = [false, false, true, true];

todolist.filter((x, i) => {
  return !finished[i];
});

// 함수화 [패턴화] 시키면
const newToDoList = (todolist, finished) => {
  return todolist.filter((x, i) => {
    return !finished[i];
  });
};

// x 기준으로 나눴을 때(slice) 나눠진 문자열의 각각 길이를 배열화
//"xabcxdefxghi"
// [0,3,3,3]

const test2 = (word) => {
  return word.split("x").map((x) => {
    return x.length;
  });
};

// 위의 코드 간략화
const test3 = (word) => word.split("x").map((x) => x.length);

const fruits = ["melon", "kiwi", "apple", "banana", "orange"];
// 모음 : a, e, i, o, u만 대문자로 바꾸기

// "melon".split("").map((X) => {
//   return x == "a" || x == "e" || x == "i" || x == "o" || x == "u"
//     ? X.toUpperCase()
//     : x;
// });

// fruits.map((x) =>
//   x
//     .split("")
//     .map((x) =>
//       x == "a" || x == "e" || x == "i" || x == "o" || x == "u"
//         ? X.toUpperCase()
//         : x
//     )
// );

// 코드 더 예쁘게
const vowels = ["a", "e", "i", "o", "u"];

fruits.map((x) =>
  x.split("").map((y) => vowels.some((v) => (v == y ? y.toUpperCase() : y)))
);

// 1~100까지 만들고, 369 만들기
// [1,2,"👏","👏",..,29,"👏","👏"]

// const array369 = Array(100)
//   .fill(0)
//   .map((x, i) => i + 1)
//   .map((y) => {
//     return String(y)
//   }).map((z) => {
//   });
// (y.includes("3") ? (y = "👏") : x));

// console.log(array369);

// const three = ["3"];

//알고리즘 문제
// 해당 타입의 방법이 없으면 다른 타입으로 바꾸기(String, Array, Number)
const num = Array(100)
  .fill(0)
  .map((x, i) => String(i + 1)) // index를 0이 아닌 1부터 시작하려 i + 1
  .map((x) =>
    x.includes("3") || x.includes("6") || x.includes("9") ? "👏" : x
  );

console.log(num);
