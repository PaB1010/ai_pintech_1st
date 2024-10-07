// 1. spread 연산자
// +, -, *, /, ==, !, ...

// 1] 배열일때
// 1) 문자열
// "coffe".split("") 보다 쉬운 것
const sreadArray = [..."coffee"];
// ["c", "o", "f", "f", "e", "e"]

// 2) rest
const fruits = ["apple", "orange", "kiwi", "grape"];
const apple = fruits[0];
// apple

const [first, second] = fruits;
// apple, orange

const [b, ...c] = fruits;
// b = apple
// c = ["orange", "kiwi", "grape"]

// Quiz : ice_americano -> i와 a만 빼고싶으면
const [ice, coffee] = "ice_americano".split("_");
// ice = ice
// coffee = americano

// const [first] = [...ice];
// ice에서 first니까 i
const [a] = [...coffee][0];
// americano에서 0번째니까 a

// 2] 오브젝트일 때
const person = { name: "차은우", age: 28, agency: "판타지오" };

// const {name} = person;
// name = "차은우"

const { name, ...others } = person;
// name : 차은우
// others = {age: 28, agency: "판타지오"}

const son = { name: "손흥민", position: "윙" };
const tottham = { club: "토트넘", number: 7 };
const korea = { nation: "대한민국", number: 10 };

const a0 = { son, tottham };
// {{ name: "손흥민", position: "윙" }, { club: "토트넘", number: 7 }}
// spread 해주지 않아서 오브젝트 안에 오브젝트

const a1 = { ...son, ...tottham };
// { name: "손흥민", position: "윙", club: "토트넘", number: 7 }
// 한 오브젝트로 통합

const a2 = { ...son, ...korea };
// { name: "손흥민", position: "윙", nation: "대한민국", number: 10 }
// 한 오브젝트로 통합

const coffeeName = "아메리카노";
const coffeeShots = 2;

// k값과 v값이 같으면 한단어 가능
const coffee1 = {
  //   coffeeName: coffeeName 은 키와 값이 같으니 아래처럼 한단어로 축약 가능
  coffeeName,
  coffeeShots: coffeeShots,
};
