import React, { CSSProperties } from "react";
import ChampImg, { ChampImgProp } from "./Champ/ChampImg";
import ChampName, { ChampNameProps } from "./Champ/ChampName";
import CounterChampImg, {
  CounterChampImgProps,
} from "./Counter/CounterChampImg";
import Percent, { PercentProps } from "./Percent/Percent";
import Position, { PositionProps } from "./Position/Position";
import Rank, { RankProps } from "./Rank/Rank";
import RankEl, { RankElProps } from "./Rank/RankEl";
import Tier, { TierProps } from "./Tier/Tier";

export type CardProps = ChampImgProp &
  ChampNameProps &
  CounterChampImgProps &
  PercentProps &
  PositionProps &
  RankProps &
  RankElProps &
  TierProps;

const Card = (props: CardProps) => {
  const CardStyle: CSSProperties = {
    display: "flex",
    flexDirection: "row",
    gap: "10px",
    alignContent: "center",
    // justifyContent: "space-evenly",
    padding: "5px 10px",
    borderBottom: "1px solid gray",
  };
  return (
    <div style={CardStyle}>
      <Rank ChampRank={props.ChampRank}></Rank>
      <RankEl rankEl={props.rankEl}></RankEl>
      <ChampImg ChampImg={props.ChampImg}></ChampImg>
      <ChampName ChampName={props.ChampName}></ChampName>
      <Tier Tier={props.Tier}></Tier>
      <Position Position={props.Position}></Position>
      <Percent
        Winpercent={props.Winpercent}
        Pickpercent={props.Pickpercent}
        Banpercent={props.Banpercent}
      ></Percent>
      <ChampImg ChampImg={props.ChampImg}></ChampImg>
    </div>
  );
};

export default Card;
