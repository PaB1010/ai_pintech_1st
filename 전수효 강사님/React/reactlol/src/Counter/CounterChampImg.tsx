import React, { CSSProperties } from "react";

export type CounterChampImgProps = {
  CounterChampImage: string | undefined;
};

const CounterChampImg = (props: CounterChampImgProps) => {
  const CounterChampImageStyle: CSSProperties = {
    width: "25px",
    height: "25px",
    objectFit: "cover",
    flex: 0.2,
  };

  return (
    <div>
      <img
        style={CounterChampImageStyle}
        src={props.CounterChampImage}
        alt=""
      />
    </div>
  );
};

export default CounterChampImg;
