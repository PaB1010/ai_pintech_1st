//버스 종류
// 마을 버스, 시내 버스, 고속 버스, 심야 버스
// 1500, 2000, 8000, 10000
// 경기권, 충청권, 강원권, 제주권
// +2000, +3000, +3000, +10000
// 일반석, 프리미엄석, 넷플석
// +1000, +3000, +4000

// 나이 13세 이하면 20%, 65세 이상 50%, 나머지 100%임 ㅅㄱ

const bus = {
  type: [
    { name: "마을 버스", price: 1500 },
    { name: "시내 버스", price: 2000 },
    { name: "고속 버스", price: 8000 },
    { name: "심야 버스", price: 10000 },
  ],
  area: [
    { name: "경기권", price: 2000 },
    { name: "충청권", price: 3000 },
    { name: "강원권", price: 3000 },
    { name: "제주권", price: 10000 },
  ],
  seat: [
    { name: "일반석", price: 1000 },
    { name: "프리미엄석", price: 3000 },
    { name: "넷플석", price: 4000 },
  ],
};

const busType = Number(
  prompt(
    `${bus.type[0].name} ${bus.type[1].name} ${bus.type[2].name} ${bus.type[3].name} 중에 고르세요!`
  )
);
const busArea = Number(
  prompt(
    `${bus.area[0].name} ${bus.area[1].name} ${bus.area[2].name} ${bus.area[3].name} 중에 고르세요!`
  )
);
const busSeat = Number(
  prompt(
    `${bus.seat[0].name} ${bus.seat[1].name} ${bus.seat[2].name} ${bus.seat[3].name} 중에 고르세요!`
  )
);
const total =
  bus.type[busType].price + bus.area[busArea].price + bus.seat[busSeat].price;

const age = Number(prompt("몇살임?"));
const msg = `버스 종류:${bus.type[busType].name}, 버스 행선지:${bus.area[busArea].name}, 버스 좌석:${bus.seat[busSeat].name}`;

if (age <= 13) {
  console.log(`${msg} 총 금액:${total * 0.8}`);
} else if (65 <= age) {
  console.log(`${msg} 총 금액:${total * 0.5}`);
} else {
  console.log(`${msg} 총 금액:${total * 1}`);
}
