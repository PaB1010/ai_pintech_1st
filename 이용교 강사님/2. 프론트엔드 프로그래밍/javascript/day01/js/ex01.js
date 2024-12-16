// id가 button인 요소(객체) 선택
const buttonEl = document.getElementById("button");

console.log("buttonEl", buttonEl);
// 아직 DOMTree 구성 전이라 null

window.addEventListener("DOMContentLoaded", function () {
  const buttonEl2 = document.getElementById("button");
  console.log("buttonEl2", buttonEl2);
  // 정상적으로 document 객체 출력
});