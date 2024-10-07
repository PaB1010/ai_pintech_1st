import React, { CSSProperties } from "react";

export type ChampNameProps = {
  ChampName: string;
};

const ChampName = (props: ChampNameProps) => {
  const champNameStyle: CSSProperties = {
    flex: 0.5,
    color: "#3F4A50",
    fontWeight: "bold",
  };
  return <span style={champNameStyle}>{props.ChampName}</span>;
};

export default ChampName;
