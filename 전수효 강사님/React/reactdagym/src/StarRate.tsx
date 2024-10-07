import React, { CSSProperties, SVGProps } from "react";

export type StarRateProps = {
  starRate: number;
};

const StarRate = (props: StarRateProps) => {
  const StarRateStyle: CSSProperties = {
    color: "#FFC500",
    fontSize: "12px",
    fontWeight: "bold",
  };
  return <span style={StarRateStyle}>{props.starRate}</span>;
};

export default StarRate;
