// | (union) : or
// string 혹은 number type이면 OK
const b: string | number = "1";

// 배열-오브젝트로 name[문자], age[문자 or 숫자]
const list: {
  name: string;
  age: string | number;
}[] = [
  {
    name: "김시원",
    age: "27",
  },
  {
    name: "김서연",
    age: "23",
  },
];

// & (intersection [and])
// const b2 : string & number => never 타입으로 자동 변경 (string이면서 number인건 불가능하니까)

//즉 이런식으로 사용함
const b2: { name: string } & { age: number } = {
  age: 9,
  name: "잼민이",
};

// 위의 & 함축
const b22: { name: string; age: number } = {
  age: 9,
  name: "잼민이",
};

// Any : 모든 Type 가능
const b3: any = { name: "뭐든지 가능" };

// 처음 정의시 x가 any타입으로 되어있어 string으로 변경함
const b4: (x: string) => string = (x) => `${x}맛 아이스크림`;

// 자기 수의 제곱을 돌려주는 함수
const b5: (x: number) => number = (x) => x ** 2;
