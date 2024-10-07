import React, { CSSProperties } from "react";
import BanPercent, { BanPercentProps } from "./BanPercent";
import PickPercent, { PickPercentProps } from "./PickPercent";
import WinPercent, { WinPercentProps } from "./WinPercent";

export type PercentProps = BanPercentProps & WinPercentProps & PickPercentProps;

const Percent = (props: PercentProps) => {
  const PercentStyle: CSSProperties = {
    display: "flex",
    flexDirection: "row",
    justifyContent: "space-around",
    gap: "30px",
    flex: 0.5,
  };

  return (
    <div style={PercentStyle}>
      <span>{props.Banpercent}%</span>
      <span>{props.Winpercent}%</span>
      <span>{props.Pickpercent}%</span>
    </div>
  );
};

export default Percent;
