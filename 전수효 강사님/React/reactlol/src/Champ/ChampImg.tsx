import React, { CSSProperties } from "react";

export type ChampImgProp = {
  ChampImg: string;
};

const ChampImg = (props: ChampImgProp) => {
  const albumStyle: CSSProperties = {
    // flex: 1,
    width: "32px",
    height: "32px",

    objectFit: "cover",
  };
  const albumImgStyle: CSSProperties = {
    width: "100%",
    height: "100%",
    borderRadius: "10px",
  };
  return (
    <div style={albumStyle}>
      <img style={albumImgStyle} src={props.ChampImg} alt="" />
    </div>
  );
};

export default ChampImg;
