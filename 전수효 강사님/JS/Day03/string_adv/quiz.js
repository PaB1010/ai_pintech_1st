// 유저에게 비밀 번호 설정을 물어보고(prompt)
// 비밀번호가 it,IT를 포함하면 비밀번호 설정 완료! 출력, 포함하지 않을경우 비밀번호 설정 오류! 출력

// const pw = prompt("비밀 번호 설정을 하시겠습니까?");
// const truePw = pw.includes("it") || pw.includes("IT");

// const setting = truePw ? "비밀번호 설정 완료!" : "비밀번호 설정 오류!";

// console.log(setting); // alert(setting);

// 1. 유저에게 좋아하는 음식을 입력 받고 그 음식을 5번 출력하는 프로그램
// const food = prompt("좋아하는 음식을 입력해주세요");
// alert(food.repeat(5));

// 2. 유저에게 좋아하는 음식과 횟수를 입력받고 그 음식을 횟수만큼 출력하는 프로그램
// ex) 떡볶이 5 -> 떡볶이떡볶이떡볶이떡볶이떡볶이
// const foodName = prompt("좋아하는 음식과 횟수를 입력해주세요");
// const foodArray = foodName.split(" ");
// const name = foodArray[0];
// const num = Number(foodArray[1]);
// alert(name.repeat(num));

// 3. 유저에게 알파벳 단어를 입력 받고 6글자보다 작으면 소문자화 하고, 크면 대문자화해서 출력하는 프로그램
// const alpha = prompt("알파벳을 입력해주세요");
// const is6under = alpha.length < 6;

// const result = is6under ? alpha.toLowerCase() : alpha.toUpperCase();
// alert(result);

// 4. 뉴스기사 스크랩해서 배열화

// const news = `Left-leaning politician Anura Kumara Dissanayake has won Sri Lanka’s presidential election after a historic second round of counting.
// No candidate won more than 50% of the total votes in the first round, where Dissanayake got 42.31% while his closest rival, opposition leader Sajith Premadasa, got 32.76%.
// But Dissanayake, who promised voters good governance and tough anti-corruption measures, emerged as winner after the second count, which tallied voters' second and third choice candidates.
// The election on Saturday was the first to be held since mass protests unseated the country's leader, Gotabaya Rajapaksa, in 2022 after Sri Lanka suffered its worst economic crisis.`;

// arlert(news.split(" "));

// 5. 유저에게 단어를 입력받고 소문자면 대문자로 바꿔 출력, 대문자면 소문자로 바꿔 출력
const word = prompt("단어를 입력해주세요");
const result1 =
  word == word.toUpperCase() ? word.toLowerCase() : word.toUpperCase();
alert(result1);

// 6. 유저에게 비밀번호 설정을 물어보고
// -1. 길이가 8~20가 아니면 비밀번호 길이 오류! 출력
// -2. 시작이 it, IT 아닐시 비밀번호 시작은 it,IT로 시작 필수 출력
// -3. 특수문자 &#@! 중에 하나라도 없으면 비밀번호에 반드시 특수문자 포함 출력
// 위의 조건이 모두 통과되면 비밀번호 설정 완료 출력

const pw = prompt("비밀번호를 입력해주세요");
const staPw = pw.startsWith("it") || pw.startsWith("IT");
const lenPw = 20 >= pw.length && pw.length >= 8;
const incPw =
  pw.includes("&") || pw.includes("#") || pw.includes("@") || pw.includes("!");

// const result =
//   staPw && lenPw && incPw ? "비밀번호 설정 성공!" : "비밀번호 설정 오류!";
// 이렇게 할경우 틀린 경우마다 메시지를 띄울 수 없어서

if (!staPw) {
  alert("비밀번호 시작은 it, IT여야 합니다");
} else if (!lenPw) {
  alert("비밀번호의 길이는 8~20pt 여야 합니다");
} else if (!incPw) {
  alert("비밀번호에는 특수문자가 포함되어야합니다");
} else {
  alert("비밀번호 설정 완료");
}

alert(result);
