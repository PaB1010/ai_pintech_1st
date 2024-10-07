// string_adv

const pizza = "cheese pizza";

// includes = 포함합니까?
const hasCheese = pizza.includes("cheese"); // true
const hasPine = pizza.includes("pineapple"); // false
const hasC = pizza.includes("c"); // true
const hasEE = pizza.includes("ee"); // true

// indexOf = 몇번째입니까?
const indexH = pizza.indexOf("h"); // 1 (맨앞의 c = 0이니까 h = 1)
const indexB = pizza.indexOf("b"); // -1(false = -1)

// replace = "a","b" = a를 b로 바꿈
pizza.replace("z", "k"); //cheese pikza (맨앞의 z만 바뀜)
pizza.replaceAll("z", "k"); //cheese pikka (모든 z가 바뀜)

pizza.toUpperCase(); // 대문자화
pizza.toLowerCase(); // 소문자화

//"cheese pizza"
// 나누기
pizza.slice(0, 4); // chee (0번 문자부터 4번 문자까지)

// !!!나누기 [배열화]!!!
pizza.split("i"); // ["cheese p", "zza"]
pizza.split(" "); // ["cheese", "pizza"] (공백에서 자름)

// 반복하기
pizza.repeat(3); // cheese pizza cheese pizza cheese pizza

pizza.length; // 12 = 문자의 길이, 띄어쓰기 포함! (length는 함수가 아니라 변수라고 생각)

pizza.startsWith("pi"); // pi로 시작하지 않으므로 false

pizza.endsWith("za"); // za로 끝나니까 true
