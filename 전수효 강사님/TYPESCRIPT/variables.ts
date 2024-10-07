const a = "아메리카노";
const a1 = "라떼";

// 타입 어노테이션, a2에는 stirng타입의 값만 올 수 있으므로, 아래 줄은 a2에 빨간줄로 오류 표시
// const a2: string = 1;
const a2: string = "1";
const a3: boolean = !!"";

// a4에 커서를 대면 number 라고 나옴
// const a4 = [1,2,3,4,5];
const a4: number[] = [1, 2, 3, 4, 5];

const a5: {
  name: string;
  isKorean: boolean;
  price: number;
}[] = [
  { name: "가나다", isKorean: true, price: 2000 },
  { name: "abc", isKorean: false, price: 2000 },
];

// age, isMan, nation []
const a6: {
  age: number;
  isMan: boolean;
  nation: string;
}[] = [
  { age: 27, isMan: false, nation: "한국" },
  { age: 21, isMan: true, nation: "Japan" },
  { age: 24, isMan: false, nation: "Rusia" },
];
