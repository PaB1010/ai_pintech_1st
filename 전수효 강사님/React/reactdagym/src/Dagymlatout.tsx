import React from "react";
import Card from "./Card";
import { centerList } from "./data";
import { text } from "stream/consumers";

const Dagymlatout = () => {
  return (
    <main style={{ width: "100vw" }}>
      <section style={{ width: "100%", maxWidth: "1000px", margin: "0 auto" }}>
        {centerList.map((v) => {
          return (
            <Card
              image={v.gymPhotoSmall}
              gymName={v.gymName}
              address={v.address}
              price={v.price.lowestPrice / (v.price.period || 12)}
              starRate={v.review.rate}
              reviews={v.review.count}
              categories={v.tags.join("")}
              text={"일일권"}
            />
          );
        })}
      </section>
    </main>
  );
};

export default Dagymlatout;
