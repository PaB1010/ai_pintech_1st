// 1. 좋아하는 색 5개 배열로 넣은 뒤에
// grid로 3열 박스(100개) 형태로 넣기

const main = document.createElement("main");

const container = document.createElement("section");
container.classList.add("container");
main.appendChild(container);

const colors = ["skyblue", "navy", "lightgray", "green", "black"];

Array(100)
  .fill(0)
  .forEach((v, i) => {
    const box = document.createElement("div");
    box.classList.add("box");
    box.style.backgroundColor = colors[i % colors.length];
    container.appendChild(box);
  });

document.body.appendChild(main);
