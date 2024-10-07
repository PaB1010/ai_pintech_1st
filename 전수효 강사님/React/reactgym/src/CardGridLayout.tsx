import { CSSProperties } from "react";
import Card from "./Card";
import { ReactNode } from "react";
import data from "./data";

type DATA = {
  gymName: string;
  gymPhotoSmall: string;
  tags: string[];
  service: string;
  originalPrice: number;
  period: number | null;
};
const CardGridLayout = () => {
  const gymData = data.result.centerList;
  const CardGridLayoutStyle: CSSProperties = {
    display: "flex",
    flexDirection: "column",
  };
  return (
    <section style={CardGridLayoutStyle}>
      {gymData.map((v) => (
        <Card
          gymName={v.gymName}
          gymPhotoSmall={v.gymPhotoSmall}
          originalPrice={v.price.originalPrice}
          service={v.service.free}
          tags={v.tags}
        />
      ))}
    </section>
  );
};

export default CardGridLayout;
