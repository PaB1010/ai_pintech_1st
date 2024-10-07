import React, { CSSProperties } from "react";
import Album from "./Album";
import Address from "./Address";
import CategoryList from "./CategoryList";
import GymName from "./GymName";
import Reviews from "./Reviews";
import StarRate from "./StarRate";
import CardUpper, { CardUpperProps } from "./CardUpper";
import CardDown from "./CardDown";

type CardProps = CardUpperProps;

const Card = (props: CardProps) => {
  const cardStyle: CSSProperties = {
    padding: "10px",
    display: "flex",
    flexDirection: "column",
    boxShadow: "rgba(100, 100, 111, 0.2) 0px 7px 29px 0px",
    borderRadius: "20px",
    gap: "10px",
  };

  // const { cardUpperProps } = props;
  // <CardUpper {...props.cardUpperProps} /> 와 같음(3열)

  return (
    <article style={cardStyle}>
      <CardUpper {...props} />
      <CardDown />
    </article>
  );
};

export default Card;
