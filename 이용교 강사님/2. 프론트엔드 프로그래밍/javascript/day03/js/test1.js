// window.onload는 절대 사용 X
// 전역 환경에서 사용시 오염 문제 발생
/*
window.onload = function () {
  alert("test1");
};
*/

window.addEventListener("load", function () {

  alert("test1");
});