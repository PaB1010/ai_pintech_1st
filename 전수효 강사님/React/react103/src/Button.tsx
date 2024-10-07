import { CSSProperties } from "react";

type ButtonCSS = { color: string; padding: string };
type ButtonText = { text: string };

type ButStyle = ButtonCSS & ButtonText;

// type ButStyle = {
//   color: string;
//   padding: string;
//   text: string;
// };

// props없이 이렇게도 사용 가능!
// const Button = ({color, padding,text}:ButStyle) => {
// const cssStyle: CSSProperties = {
//     color,
//    padding,
//   };
//   return <button style={cssStyle}>{text}</button>;
// };

const Button = (props: ButStyle) => {
  const cssStyle: CSSProperties = {
    color: props.color,
    padding: props.padding,
  };
  return <button style={cssStyle}>{props.text}</button>;
};

export default Button;
