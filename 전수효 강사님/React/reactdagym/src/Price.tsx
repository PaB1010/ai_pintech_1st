import React, { CSSProperties } from "react";

export type PriceProps = {
  price: number;
};

const Price = (props: PriceProps) => {
  const priceStyle: CSSProperties = {
    fontSize: "20px",
    fontWeight: "bold",
    color: "#3d4148",
  };

  return (
    <div>
      <span style={priceStyle}>{props.price}~</span>
      <span>/월</span>
    </div>
  );
};

export default Price;
