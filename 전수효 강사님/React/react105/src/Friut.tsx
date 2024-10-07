import React from "react";

type FruitProps = {
  fruitName: string;
  fruitAmount: number;
  click: () => void;
};

const Friut = (props: FruitProps) => {
  return (
    <span onClick={props.click}>
      {props.fruitName} : {props.fruitAmount}개
    </span>
  );
};

export default Friut;
