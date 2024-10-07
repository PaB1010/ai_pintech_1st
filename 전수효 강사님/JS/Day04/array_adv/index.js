// arr 함수들
// map : 요소 내용 바꾸기
// filter : 걸러내기, 어떠한 조건에 부합하는 요소만 남기기

[10, 20, 30, 40, 50].filtere((x) => {
  // return true; (모두 남음)
  // return false; (모두 걸러짐)
  //   return 30 > x; // (30 미만만 남음)
});

[10, 20, 30, 40, 50].filtere((x) => {
  //   return x == 20 || x == 40; // (20이나 40만 남음)
});

// every : 어떠한 조건에 모든 요소가 부합한가? (return Boolean(true or false))
[10, 20, 30, 40, 50].every((X) => {
  // return x > 10; <- 10이 걸려서 false 값
});

// some : 어떠한 조건에 한개라도 요소가 부합한가? (return Boolean(true or false))
[10, 20, 30, 40, 50].every((X) => {
  // return x > 10; <- 10이 걸렸지만 나머지가 부합하므로 true값
  // return x > 60; <- 하나도 부합하지 않아 false값
});

// Array 함수로 배열 만들기

// 배열[] 10칸 만들기 (결과 : undefined 10칸, 주의 : (null) 10칸이 아님!)
Array(10);

// 100칸을 모두 1로 채움
Array(100).fill(1);

// fill된 1이 모두 2로 바뀜
Array(100)
  .fill(1)
  .map((X) => {
    return x + 1;
  });

// x는 매개 변수, i는 배열에서 몇번째인지 알려주는 변수
// 결과 값은 [0,1,2,3,4,5,6,7,8...19]
Array(20)
  .fill(0)
  .map((X, i) => {
    return i;
  });
