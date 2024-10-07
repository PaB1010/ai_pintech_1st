import React, { CSSProperties } from "react";

export type GymNameProps = {
  gymName: string;
};
const GymName = (props: GymNameProps) => {
  const GymNameStyle: CSSProperties = {
    fontWeight: "bold",
    lineHeight: "26px",
  };
  return <span style={GymNameStyle}>{props.gymName}</span>;
};

export default GymName;
