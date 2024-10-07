import { CSSProperties } from "react";

type BoxProps = BoxColor & BoxSize;

type BoxColor = {
  backgroundcolor: "pink" | "orange" | "skyblue" | "red";
};

type BoxSize = {
  size: "small" | "medium" | "large";
};

const Box = (props: BoxProps) => {
  const sizeMap = {
    small: "50px",
    medium: "100px",
    large: "200px",
  };
  const boxStyle: CSSProperties = {
    backgroundColor: props.backgroundcolor,
    width: sizeMap[props.size],
    height: sizeMap[props.size],
  };
  return <div style={boxStyle}></div>;
};

export default Box;
