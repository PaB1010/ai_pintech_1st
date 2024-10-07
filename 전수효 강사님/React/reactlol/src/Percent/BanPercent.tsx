import React from "react";

export type BanPercentProps = {
  Banpercent: number;
};

const BanPercent = (props: BanPercentProps) => {
  return <span>{props.Banpercent}%</span>;
};

export default BanPercent;
