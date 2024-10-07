import React, { CSSProperties } from "react";
import Album, { AlbumProps } from "./Album";
import CategoryList, { CategoryListProps } from "./CategoryList";
import GymName, { GymNameProps } from "./GymName";
import StarRate, { StarRateProps } from "./StarRate";
import Reviews, { ReviewsProps } from "./Reviews";
import Address, { AdressProps } from "./Address";
import Tag, { TagProps } from "./Tag";
import Price, { PriceProps } from "./Price";

export type CardUpperProps = AlbumProps &
  CategoryListProps &
  GymNameProps &
  StarRateProps &
  ReviewsProps &
  AdressProps &
  TagProps &
  PriceProps;

const CardUpper = (props: CardUpperProps) => {
  const cardUpperStyle: CSSProperties = {
    display: "flex",
    gap: "10px",
  };

  const rightStyle: CSSProperties = {
    display: "flex",
    flexDirection: "column",
    justifyContent: "space-between",
    width: "90%",
  };

  const infoStyle: CSSProperties = {
    display: "flex",
    flexDirection: "column",
    fontWeight: "bold",
  };

  const eventStyle: CSSProperties = {
    display: "flex",
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "space-between",
  };

  return (
    <div style={cardUpperStyle}>
      <Album image={props.image}></Album>
      <div style={rightStyle}>
        <div style={infoStyle}>
          <CategoryList categories={props.categories}></CategoryList>
          <div>
            <GymName gymName={props.gymName}></GymName>
            <div>
              <StarRate starRate={props.starRate}></StarRate>
              <Reviews reviews={props.reviews}></Reviews>
              <Address address={props.address}></Address>
            </div>
          </div>
        </div>
        <div style={eventStyle}>
          <Tag text={props.text}></Tag>
          <Price price={props.price}></Price>
        </div>
      </div>
    </div>
  );
};

export default CardUpper;
