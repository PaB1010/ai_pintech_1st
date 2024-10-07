import React, { useState } from "react";
import Friut from "./Friut";

const Cafe = () => {
  const [coffee, setCoffee] = useState({
    americano: { amount: 0, price: 1000 },
    latte: { amount: 0, price: 1500 },
    espresso: { amount: 0, price: 2000 },
  });

  const changeAericano = () => {
    setCoffee((prev) => {
      return {
        ...prev,
        americano: { amount: prev.americano.amount + 1, price: 1000 },
      };
    });
  };

  const changeLatte = () => {
    setCoffee((prev) => {
      return {
        ...prev,
        latte: { amount: prev.latte.amount + 1, price: 1500 },
      };
    });
  };

  const changeEsporesso = () => {
    setCoffee((prev) => {
      return {
        ...prev,
        espresso: { amount: prev.espresso.amount + 1, price: 2000 },
      };
    });
  };
  return (
    <div>
      <div>
        <Friut
          click={changeAericano}
          fruitAmount={coffee.americano.amount}
          fruitName={"아메리카노"}
        ></Friut>
      </div>
      <div>
        <Friut
          click={changeLatte}
          fruitAmount={coffee.latte.amount}
          fruitName={"라떼"}
        ></Friut>
      </div>
      <Friut
        click={changeEsporesso}
        fruitAmount={coffee.espresso.amount}
        fruitName={"에스프레소"}
      ></Friut>
      <div>
        <span>
          커피 개수 총합 :{" "}
          {coffee.americano.amount +
            coffee.latte.amount +
            coffee.espresso.amount}
          잔
        </span>
      </div>
      <div>
        <span>
          커피 가격 총합 :{" "}
          {coffee.americano.amount * coffee.americano.price +
            coffee.latte.amount * coffee.latte.price +
            coffee.espresso.amount * coffee.espresso.price}
          원
        </span>
      </div>
    </div>
  );
};

export default Cafe;
