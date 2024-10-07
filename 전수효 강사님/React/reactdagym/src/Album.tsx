import React, { CSSProperties } from "react";

export type AlbumProps = {
  image: string;
};

const Album = (props: AlbumProps) => {
  const AlbStyle: CSSProperties = {
    width: "130px",
    height: "150px",
  };
  const imgStyle: CSSProperties = {
    width: "100%",
    height: "100%",
    objectFit: "cover",
    borderRadius: "10px",
  };

  return (
    <div style={AlbStyle}>
      <img style={imgStyle} src={props.image}></img>
    </div>
  );
};

export default Album;
