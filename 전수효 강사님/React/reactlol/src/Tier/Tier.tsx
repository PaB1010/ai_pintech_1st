import React, { CSSProperties } from "react";

export type TierProps = {
  Tier: number;
};

const Tier = (props: TierProps) => {
  const TierMap: any = {
    1: "https://s-lol-web.op.gg/assets/images/tiers/01-icon-01-lol-icon-tier-1.svg?v=1724034092925",
    2: "https://s-lol-web.op.gg/assets/images/tiers/01-icon-01-lol-icon-tier-2.svg?v=1724034092925",
    3: "https://s-lol-web.op.gg/assets/images/tiers/01-icon-01-lol-icon-tier-3.svg?v=1724034092925",
    4: "https://s-lol-web.op.gg/assets/images/tiers/01-icon-01-lol-icon-tier-4.svg?v=1724034092925",
    5: "https://s-lol-web.op.gg/assets/images/tiers/01-icon-01-lol-icon-tier-5.svg?v=1724034092925",
  };

  const TierStyle: CSSProperties = {
    flex: 2,
    width: "32px",
    height: "32px",
    objectFit: "cover",
  };
  return (
    <div>
      <img style={TierStyle} src={TierMap[props.Tier]} alt="" />
    </div>
  );
};

export default Tier;
