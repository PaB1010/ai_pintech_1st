import { CSSProperties, ReactNode } from "react";
import data from "./data";

type DATA = {
  gymName: string;
  gymPhotoSmall: string;
  tags: string[];
  service: string;
  originalPrice: number;
};
const Card = (props: DATA) => {
  const gymPrice = props.originalPrice / 12;

  const priceInt = parseInt(`${gymPrice}`);

  const CardSTyle: CSSProperties = {
    borderRadius: "20px",
    backgroundColor: "white",
    boxShadow: "rgba(100, 100, 111, 0.2) 0px 7px 29px 0px",
    width: "75%",
    padding: "10px 20px",
  };

  return (
    <main style={CardSTyle}>
      <section>
        <div className="album">
          <img src={props.gymPhotoSmall}></img>
        </div>
        <div className="contants">
          <div className="grayText">{props.tags}</div>
          <div>{props.gymName}</div>
          <div className="boldStyle">{priceInt}원~/월</div>
          <div className="smallText">{props.service}</div>
        </div>
      </section>
    </main>
  );
};

export default Card;
