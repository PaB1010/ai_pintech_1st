//typeAlias (타입에게 별명 부여)

type person = { name: string; age: number; gender: string };
type college = { id: number; grade: number; major: string };
type collegeStudent = person & college;
// type collegeStudent = person &  { id: number; grade: number; major: string };

const c1: person = {
  name: "김시원",
  age: 27,
  gender: "여",
};

// 똑같이 person 타입 만들때
const c2: person[] = [];

// person이면서 college인 타입
// const c3: person & college = {
// 타입 두개를 묶어 새 타입을 만들어 코드 정리
const c3: collegeStudent = {
  name: "김시원",
  age: 27,
  gender: "여",
  id: 12345,
  grade: 1,
  major: "실용음악과",
};

type product = { name: string; price: number };

type meal = {
  calories: number;
  category: string;
};

type dessert = {
  calories: number;
  sweetnessLevel: number;
};

const saltBread: product & meal = {
  name: "소금빵",
  calories: 150,
  category: "빵",
  price: 1500,
};

const eggTart: product & dessert = {
  name: "에그타르트",
  calories: 200,
  price: 2500,
  sweetnessLevel: 3,
};
