import { CSSProperties } from "react";

type Box2Props = {
  backcolor: string;
};

const Box2 = (props: Box2Props) => {
  const Box2Style: CSSProperties = {
    backgroundColor: props.backcolor,
    borderRadius: "999999px",
    width: "150px",
    height: "150px",
  };
  return <div style={Box2Style}></div>;
};

export default Box2;
