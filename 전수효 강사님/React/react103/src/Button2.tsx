import { CSSProperties } from "react";

type ButProps = ButColor & ButHSC;
type ButColor = { color: "Primary" | "Hover" | "Deactive" };
type ButHSC = { radius: "Hard" | "Smooth" | "Circle" };

const Button2 = (props: ButProps) => {
  const border = {
    Hard: "0px",
    Smooth: "5px",
    Circle: "20px",
  };
  const ColorList = {
    Primary: "#205BF3",
    Hover: "#478DF5",
    Deactive: "#979797",
  };
  const ButStyle2: CSSProperties = {
    borderRadius: border[props.radius],
    backgroundColor: ColorList[props.color],
    color: "white",
    padding: "10px 45px",
    fontSize: "32px",
  };
  return <button style={ButStyle2}>Button</button>;
};

export default Button2;
