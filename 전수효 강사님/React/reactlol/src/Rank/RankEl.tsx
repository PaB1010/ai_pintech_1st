import React, { CSSProperties } from "react";

export type RankElProps = {
  rankEl: number;
};

const RankEl = (props: RankElProps) => {
  const rankElStyle: CSSProperties = {
    flex: 0.2,
    fontSize: "25px",
    color: "#97CE9E",
  };
  return <span style={rankElStyle}>{props.rankEl}</span>;
};

export default RankEl;
