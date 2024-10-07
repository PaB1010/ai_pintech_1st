// CGV 프로그램

// 1.영화 고르기 - ["베테랑2","에일리언","사랑의하츄핑"]
// 2.좌석 등급 고르기 - standard[10000], couple[20000], premium[15000], economy[8000]
// 3.팝콘 고르기 - 일반[6000], 캬라멜[6500], 치즈[6500], 반반[7000]
// 4.음료 고르기 - 탄산[2000], 에이드[3000], 커피[3000]
// 5.나이 입력 - 13세 이하면 30% 할인, 60세 이상 20% 할인[영화만]
// 콘솔 - 영화,좌석,팝콘,음료 총 금액: ~~~입니다.

const movie = {
  names: ["베테랑2", "에일리언", "사랑의 하츄핑"],
  seats: [
    { name: "Standard", price: 10000 },
    { name: "Couple", price: 20000 },
    { name: "Premium", price: 15000 },
    { name: "Economy", price: 8000 },
  ],
};
const shop = {
  popcorn: [
    { name: "갓반 팝콘", price: 6000 },
    { name: "캬라멜 팝콘", price: 6500 },
    { name: "치즈 팝콘", price: 6500 },
    { name: "반반 팝콘", price: 7000 },
  ],
  beverage: [
    { name: "탄산", price: 2000 },
    { name: "에이드", price: 3000 },
    { name: "커피", price: 3000 },
  ],
};

const moive_choose = Number(prompt(`${movie.names} 중에 고르세요`));
const seat_choose = Number(
  prompt(
    `${movie.seats[0].name} ${movie.seats[1].name} ${movie.seats[2].name} ${movie.seats[3].name} 중에 고르세요`
  )
);
const popcorn_choose = Number(
  prompt(
    `${shop.popcorn.name[0]} ${shop.popcorn.name[1]} ${shop.popcorn.name[2]} ${shop.popcorn.name[3]} 중에 고르세요 중에 고르세요`
  )
);
const beverage_choose = Number(
  prompt(
    `${shop.beverage.name[0]} ${shop.beverage.name[1]} ${shop.beverage.name[2]} ${shop.beverage.name[3]} 중에 고르세요 중에 고르세요 중에 고르세요`
  )
);
const age = Number(prompt("몇살임?"));

const msg = `${movie.names[moive_choose]} ${movie.seats[seat_choose].name} ${shop.popcorn[popcorn_choose].name} ${shop.beverage[beverage_choose].name}`;

// lexical scope
if (age <= 13) {
  const total =
    movie.seats[seat_choose].price * 0.7 +
    shop.popcorn[popcorn_choose].price +
    shop.beverage[beverage_choose].price;
  console.log(`${msg} 총 금액: ${total}`);
} else if (age >= 60) {
  const total =
    movie.seats[seat_choose].price * 0.8 +
    shop.popcorn[popcorn_choose].price +
    shop.beverage[beverage_choose].price;
  console.log(`${msg} 총 금액: ${total}`);
} else {
  const total =
    movie.seats[seat_choose].price * 1 +
    shop.popcorn[popcorn_choose].price +
    shop.beverage[beverage_choose].price;
  console.log(`${msg} 총 금액: ${total}`);
}
