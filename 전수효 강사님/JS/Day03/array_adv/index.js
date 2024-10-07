// String, Number, Boolean, Array

const arr = ["Samsung", "LG", "Apple", "Google"];

arr.push("Hyundai"); // 배열 맨 뒤에 Hyundai 추가

arr.unshift("Hybe"); // 배열 맨 앞에 Hybe 추가

arr.pop(); // 맨 뒤 요소(현재는 현대) 빼기

arr.shift(); // 맨 앞 요소(현재는 Hybe) 빼기

arr.reverse(); // 배열 거꾸로 정렬 ["Google", "Apple", "LG", "Samsung"]

arr.indexOf("LG"); // 2번째에 있으니 1

arr.indexOf("toyoua"); // 없으니까 -1

arr.includes("Google"); // Google이 포함되어 있으니 true, 없는것 입력시 false

// 1. 유저에게 뉴스 기사를 입력 받고, 찾고 싶은 단어를 입력 받은 후
// 해당 단어가 있으면 "단어가 있습니다!", 없으면 "단어가 없습니다!" 출력

const news = prompt("뉴스를 입력해주세요");
const word = prompt("단어를 입력해주세요");
const wordNews = news.split(" ");

const result = wordNews.includes(word)
  ? "단어가 있습니다!"
  : "단어가 없습니다!";

alert(result);
