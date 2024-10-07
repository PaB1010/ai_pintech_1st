import React from "react";

export type WinPercentProps = {
  Winpercent: number;
};

const WinPercent = (props: WinPercentProps) => {
  return <span>{props.Winpercent}%</span>;
};

export default WinPercent;
