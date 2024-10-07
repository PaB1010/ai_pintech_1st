// DOM[HTML + CSS]

// element type(tag안에 컨텐츠가 있는 상태)
const div = document.createElement("div"); // element type의 div type 생성, ("button")하면 버튼으로 생성
div.innerText = "샤브샤브"; //div안에 "샤브샤브" text 컨텐츠로 넣음
div.style.color = "red"; // div의 폰트색은 red
document.body.appendChild(div); //body태그 안에 (div)를 자식으로 넣음

// 1. 버튼 태그 3개 만들기 [아메리카노] [에이드] [라떼]

// const button = document.createElement("button");
// button.innerText = "아메리카노";
// button.style.color = "white";
// button.style.backgroundColor = "skyblue";
// document.body.appendChild(button);

// const button1 = document.createElement("button");
// button1.innerText = "라떼";
// button1.style.color = "white";
// button1.style.backgroundColor = "skyblue";
// document.body.appendChild(button1);

// const button2 = document.createElement("button");
// button2.innerText = "에이드";
// button2.style.color = "white";
// button2.style.backgroundColor = "skyblue";
// document.body.appendChild(button2);

// map(변경), foreach(훑어보기)
// ["아메리카노", "에이드", "라떼"].forEach((v) => {
//   const button = document.createElement("button");
//   button.innerText = v;
//   button.style.color = "white";
//   button.style.backgroundColor = "skyblue";
//   document.body.appendChild(button);
// });

// 2. [아메리카노, 배경 노랑, 글씨 검정] [에이드, 배경 핑크, 글씨 흰색] [라떼, 배경 하늘, 글씨 주황]
// [
//   { name: "아메리카노", bg: "yellow", color: "black" },
//   { name: "에이드", bg: "pink", color: "white" },
//   { name: "라떼", bg: "skyblue", color: "orange" },
// ].forEach((v) => {
//   const button = document.createElement("button");
//   button.innerText = v.name;
//   button.style.color = v.color;
//   button.style.backgroundColor = v.bg;
//   document.body.appendChild(button);
// });

// html+css or js 선택하는 법 (사이트의 기획 파악이 우선)
// 패턴이 있다 함수 활용이 필요한 것 같다 = js
// 패턴이 없다 = html+css

const container = document.createElement("div");

// class 이름 넣는 법 2가지
// 1. clasName
// container.className = "container"

// 2. classList
container.classList.add("container"); // <div class="container"></div>

const box = document.createElement("div"); //div type의 box 생성
box.classList.add("box"); //box의 class는 box
box.style.backgroundColor = "red"; //box의 style은 backgroundColor "red"
container.appendChild(box); //box를 container의 자식으로 추가

const box1 = document.createElement("div");
box1.classList.add("box");
box1.style.backgroundColor = "yellow";
container.appendChild(box1);

document.body.appendChild(container); //container를 body에 추가
