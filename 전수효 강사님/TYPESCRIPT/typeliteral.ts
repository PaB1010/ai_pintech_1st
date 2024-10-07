// typeliteral

// 1부터 5까지만 가능한 타입
// const d1: 1 | 2 | 3 | 4 | 5 = 3;
type angryDepth = 1 | 2 | 3 | 4 | 5;
const d1: angryDepth = 5;

type jobType = "전사" | "마법사" | "궁수" | "도적";

const d2: { id: string; level: number; job: jobType } = {
  id: "★T없이맑은i☆",
  level: 8,
  job: "마법사",
};

//맥도날드 만들어보기

type Hamburger = "불고기버거" | "새우버거" | "치즈버거" | "빅맥" | "상하이버거";
type Side = "감자튀김" | "치즈스틱" | "콘솔로우" | "해쉬브라운";
type Drinks =
  | "콜라"
  | "제로콜라"
  | "환타"
  | "스프라이트"
  | "제로스프라이트"
  | "물";

type setMenu = {
  main: Hamburger;
  side: Side;
  drinks: Drinks;
};

const myMacdonald: setMenu = {
  main: "빅맥",
  side: "해쉬브라운",
  drinks: "스프라이트",
};

// type subSet = 빵, 메인, 치즈, 야채(다중선택), 소스(다중선택) 만들어보기

type Bread = "허니오트" | "하티" | "위트" | "파마산 오레가노" | "플랫브레드";
type Main = "고기" | "새우" | "에그마요" | "없음";
type Cheese = "아메리칸 치즈" | "슈레드 치즈" | "모짜렐라 치즈";
type Vegitable = "양상추" | "토마토" | "오이" | "아보카도" | "피망";
type Source = "랜치" | "스위트 어니언" | "마요네즈" | "스위트 칠리";

type subSet = {
  bread: Bread;
  main: Main;
  cheese: Cheese;
  vegitable: Vegitable[];
  source: Source[];
};

const mySubway: subSet = {
  bread: "플랫브레드",
  main: "에그마요",
  cheese: "아메리칸 치즈",
  vegitable: ["아보카도", "양상추", "토마토"],
  source: ["랜치", "스위트 칠리"],
};
