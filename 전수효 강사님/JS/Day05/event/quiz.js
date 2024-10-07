// // 1. 아메리카노 주문 버튼 태그 만들고 누르면 주문 완료!로 바뀌는 버튼 만들기

// const ameButton = document.createElement("button");
// ameButton.innerText = "아메리카노";

// ameButton.addEventListener("click", () => {
//   ameButton.innerText = "주문 완료!";
// });

// // 2. 배경색이 하늘색 버튼 태그 만들고 누르면 핑크색으로 바뀌는 버튼 만들기

// const skyButton = document.createElement("button");
// skyButton.style.backgroundColor = "skyblue";
// skyButton.innerText = "Sky Blue";
// skyButton.addEventListener("click", () => {
//   skyButton.style.backgroundColor = "pink";
//   skyButton.innerText = "Pink";
//   skyButton.addEventListener("click", () => {
//     skyButton.style.backgroundColor = "skyblue";
//     skyButton.innerText = "Sky Blue";
//   });
// });

// document.body.appendChild(ameButton);
// document.body.appendChild(skyButton);

// 3. 다른색의 버튼 5개 만들고 버튼 텍스트는 색의 이름
// 버튼을 누르면 버튼 아래의 빈 박스 색이 바뀌어야 함
const box = document.createElement("div");
box.innerText = "COLOR BOX";
box.style.width = "100px";
box.style.height = "100px";
box.style.border = "1px solid gray";

const colors = ["red", "orange", "yellow", "green", "blue"].forEach((v) => {
  const button = document.createElement("button");
  button.innerText = v;
  button.style.backgroundColor = v;
  button.addEventListener("click", () => {
    box.style.backgroundColor = v;
  });
  document.body.appendChild(button);
});

document.body.appendChild(box);

// 4. 버튼 두개 추가 [네모], [둥글게]
// 네모 버튼 -> 박스 사각형
// 둥글게 -> 박스 둥글게

//내 코드(함수화X)
// const sqButton = document.createElement("button");
// sqButton.innerText = "네에모";
// document.body.appendChild(sqButton);
// sqButton.addEventListener("click", () => {
//   box.style.borderRadius = "0px";
// });
// const ciButton = document.createElement("button");
// ciButton.innerText = "도옹글";
// document.body.appendChild(ciButton);
// ciButton.addEventListener("click", () => {
//   box.style.borderRadius = "999999px";
// });

[
  { name: "네모", radius: "0px" },
  { name: "동글", radius: "99999px" },
].forEach((v) => {
  const button = document.createElement("button");
  button.innerText = v.name;
  button.addEventListener("click", () => {
    box.style.borderRadius = v.radius;
  });
  document.body.appendChild(button);
});
