import React, { CSSProperties, useState } from "react";

type itemProps = {
  name: string;
  price: number;
};

const Bee = (props: itemProps) => {
  const beeStyle: CSSProperties = {
    display: "flex",
    flexDirection: "row",
    justifyContent: "space-between",
    padding: "20px",
    border: "1px solid grey",
    width: "500px",
  };
  const [num, setNum] = useState(1);

  const addNum = () => {
    setNum((prev) => {
      return (prev = prev + 1);
    });
  };

  const minNum = () => {
    setNum((prev) => {
      return prev == 1 ? 1 : prev - 1;
    });
  };

  //   const stringPrice = String(num*props.price).split()
  //   가격에 , 붙이고 끝에 원까지 붙이려면 split하고 이거저거 ㅇㅇ 블라블라

  return (
    <div>
      <div style={beeStyle}>
        <span>{props.name}</span>
        <button onClick={minNum}>-</button>
        <span>{num}</span>
        <button onClick={addNum}>+</button>
        <span>{num * props.price}</span>
      </div>
    </div>
  );
};

export default Bee;
