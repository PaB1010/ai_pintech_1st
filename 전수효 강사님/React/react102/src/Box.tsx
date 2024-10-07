import { CSSProperties } from "react";

type BoxStyle = {
  backgroundcolor: "red" | "blue" | "green" | "orange";
  height: string;
  width: string;
  text: string;
};

const Box = (props: BoxStyle) => {
  const cssStyle: CSSProperties = {
    width: props.width,
    height: props.height,
    backgroundColor: props.backgroundcolor,
  };
  return <div style={cssStyle}>{props.text}</div>;
};

export default Box;
