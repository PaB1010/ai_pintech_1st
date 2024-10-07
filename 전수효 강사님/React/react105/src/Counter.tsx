import React, { CSSProperties, useState } from "react";

const Counter = () => {
  const [num, setNum] = useState(0);

  const addNum = () => {
    setNum((prev) => {
      return (prev = prev + 1);
    });
  };

  const minNum = () => {
    setNum((prev) => {
      return prev > 0 ? prev - 1 : prev;
    });
  };

  //   const [color, setColor] = useState("");
  //   const redNum = () => {
  //     setColor((prev) => {
  //       return (prev = prev + "red");
  //     });
  //   };

  //   const redStyle: CSSProperties = {
  //     backgroundColor: "setColor",
  //   };

  return (
    <div>
      <button onClick={minNum}>{"-"}</button>
      <span style={{ backgroundColor: num >= 10 ? "red" : "white" }}>
        {num}
      </span>
      <button onClick={addNum}>{"+"}</button>
    </div>
  );
};

export default Counter;
