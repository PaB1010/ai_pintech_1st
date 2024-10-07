import { CSSProperties } from "react";

type CircleProps = {
  CircleColor: string;
};

const Circle = (props: CircleProps) => {
  const CircleStyle: CSSProperties = {
    backgroundColor: props.CircleColor,
    borderRadius: "9999999px",
    width: "100px",
    height: "100px",
    border: "none",
  };
  return <div style={CircleStyle}></div>;
};

export default Circle;
