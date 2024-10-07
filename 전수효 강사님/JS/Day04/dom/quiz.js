// box 2000개 [빨,주,노,초,파,남,보] 순서대로

const container = document.createElement("div");
container.classList.add("container");

// box 7개만 만들어짐
// const colorList = [
//   "red",
//   "orange",
//   "yellow",
//   "green",
//   "blue",
//   "navy",
//   "purple",
// ].forEach((x) => {
//   const box = document.createElement("div");
//   box.classList.add("box");
//   box.style.backgroundColor = x;
//   container.appendChild(box);
// });

const colorList = [
  "red",
  "orange",
  "yellow",
  "green",
  "blue",
  "navy",
  "purple",
  "skyblue",
  "pink",
];

Array(2000)
  .fill(0)
  .forEach((x, i) => {
    const box = document.createElement("div");
    box.classList.add("box");
    box.style.backgroundColor = colorList[i % colorList.length];
    container.appendChild(box);
  });

document.body.appendChild(container);
