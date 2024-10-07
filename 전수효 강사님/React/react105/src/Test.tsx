import React, { useState } from "react";
import Friut from "./Friut";

const Test = () => {
  // 사과 1000원, 바나나 1500원, 오렌지 2000원

  const [fruits, setFruits] = useState({
    apple: { amount: 0, price: 1000 },
    banana: { amount: 0, price: 1500 },
    orange: { amount: 0, price: 2000 },
  });

  const changeApple = () => {
    setFruits((prev) => {
      return { ...prev, apple: { amount: prev.apple.amount + 1, price: 1000 } };
    });
  };

  const changeBanana = () => {
    setFruits((prev) => {
      return {
        ...prev,
        banana: { amount: prev.banana.amount + 1, price: 1500 },
      };
    });
  };

  const changeOrange = () => {
    setFruits((prev) => {
      return {
        ...prev,
        orange: { amount: prev.orange.amount + 1, price: 2000 },
      };
    });
  };
  return (
    <div>
      <div>
        <Friut
          click={changeApple}
          fruitAmount={fruits.apple.amount}
          fruitName={"사과"}
        ></Friut>
      </div>
      <div>
        <Friut
          click={changeBanana}
          fruitAmount={fruits.banana.amount}
          fruitName={"바나나"}
        ></Friut>
      </div>
      <Friut
        click={changeOrange}
        fruitAmount={fruits.orange.amount}
        fruitName={"오렌지"}
      ></Friut>
      <div>
        <span>
          과일 개수 총합 :{" "}
          {fruits.apple.amount + fruits.banana.amount + fruits.orange.amount}개
        </span>
      </div>
      <div>
        <span>
          과일 가격 총합 :{" "}
          {fruits.apple.amount * fruits.apple.price +
            fruits.banana.amount * fruits.banana.price +
            fruits.orange.amount * fruits.orange.price}
          원
        </span>
      </div>
    </div>
  );
};

export default Test;
