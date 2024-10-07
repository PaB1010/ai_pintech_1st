import { CSSProperties } from "react";

type ButtonProps = {
  ButColor: "Primary" | "Hover" | "Deactive";
  ButRad: "Hard" | "Smooth" | "Circle";
};

const Button = (props: ButtonProps) => {
  const ColorList = {
    Primary: "blue",
    Hover: "red",
    Deactive: "green",
  };
  const RadList = {
    Hard: "0px",
    Smooth: "10px",
    Circle: "9999999px",
  };
  const ButtonStyle: CSSProperties = {
    backgroundColor: ColorList[props.ButColor],
    borderRadius: RadList[props.ButRad],
    color: "white",
    fontSize: "32px",
    border: "none",
  };
  return <button style={ButtonStyle}>Button</button>;
};

export default Button;
