// short circuit

// ||[or]
const a = false || true; // a = true
// const a = 5 > 10 || 5 > 1;

const b = undefined || "자바스크립트"; // b = "자바스크립트"
// const b = false(5>10) || "자바스크립트";

const username = prompt("유저 이름 입력");
alert(`${username || "Guest"}님 환영합니다.`);
// 입력 없을시 Guest, 뭐라도 입력시 username 출력

// &&[and]
const c = true && "탕수육"; // c = "탕수육"

const d = false && "탕후루"; // d = false

const isLoggin = prompt("비밀번호를 입력해주세요") == "1234";
isLoggin && alert("어서오세요"); // 1234 입력시 로그인 성공 출력
