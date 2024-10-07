// event

const button = document.createElement("button");
button.innerText = "라떼";

//addEventListener(매개 행동, 발생하는 이벤트)
button.addEventListener("click", () => {
  alert("헤이즐넛 시럽 추가");
});

document.body.appendChild(button);
