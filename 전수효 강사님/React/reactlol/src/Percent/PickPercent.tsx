import React from "react";

export type PickPercentProps = {
  Pickpercent: number;
};

const PickPercent = (props: PickPercentProps) => {
  return <span>{props.Pickpercent}%</span>;
};

export default PickPercent;
