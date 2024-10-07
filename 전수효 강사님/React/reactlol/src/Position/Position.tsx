import React, { CSSProperties } from "react";

export type PositionProps = {
  Position: string;
};

const Position = (props: PositionProps) => {
  const PositionMap: any = {
    TOP: "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-top.svg?v=1724034092925",
    JUG: "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-jug.svg?v=1724034092925",
    MID: "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-mid.svg?v=1724034092925",
    ADC: "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-bot.svg?v=1724034092925",
    SUP: "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-sup.svg?v=1724034092925",
  };

  const PositionStyle: CSSProperties = {
    flex: 0.2,
    width: "32px",
    height: "32px",
    objectFit: "cover",
  };

  return (
    <div>
      <img style={PositionStyle} src={PositionMap[props.Position]} alt="" />
    </div>
  );
};

export default Position;
