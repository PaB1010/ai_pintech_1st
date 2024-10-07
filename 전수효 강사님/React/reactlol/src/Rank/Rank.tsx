import React, { CSSProperties } from "react";

export type RankProps = {
  ChampRank: number;
};

const Rank = (props: RankProps) => {
  const rankStyle: CSSProperties = {
    fontSize: "25px",
    color: "#A2A7B9",
    flex: 0.2,
  };
  return <span style={rankStyle}>{props.ChampRank}</span>;
};

export default Rank;
