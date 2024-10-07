import React, { CSSProperties } from "react";
import Card, { CardProps } from "./Card";
import { championRankingList } from "./data";

const CardLayOut = () => {
  const opggList = { championRankingList };
  return (
    <main style={{ width: "100vw" }}>
      <section style={{ width: "80%" }}>
        {championRankingList.map((v, i) => {
          return (
            <Card
              ChampRank={v.positionTierData.rank}
              rankEl={v.positionTierData.rank_prev}
              ChampImg={v.image_url}
              ChampName={v.name}
              Tier={v.positionTier}
              Position={v.positionName}
              Winpercent={Math.round(v.positionWinRate * 100)}
              Pickpercent={Math.round(v.positionPickRate * 100)}
              Banpercent={Math.round(v.positionBanRate * 100)}
              CounterChampImage={v.image_url}
            ></Card>
          );
        })}
      </section>
    </main>
  );
};

export default CardLayOut;
