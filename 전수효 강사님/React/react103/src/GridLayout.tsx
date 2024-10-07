import { CSSProperties } from "react";
import Button2 from "./Button2";
import Box2 from "./Box2";
import Box from "./Box";

type GridNum = { repeat: number };

const GridLayout = (props: GridNum) => {
  const gridStyle: CSSProperties = {
    display: "grid",
    gridTemplateColumns: `repeat(${props.repeat},1fr)`,
    gap: "30px",
  };

  const arr = ["Primary", "Hover", "Deactive"];
  const arr1 = ["Hard", "Smooth", "Circle"];
  return (
    <section style={gridStyle}>
      {/* {arr.map((v) => {
        arr1.map((v) => {
          <Button2 color="Primary" radius="Hard" />;
        });
      })} */}
      {/* <Button2 color="Primary" radius="Hard" />
      <Button2 color="Primary" radius="Smooth" />
      <Button2 color="Primary" radius="Circle" />
      <Button2 color="Hover" radius="Hard" />
      <Button2 color="Hover" radius="Smooth" />
      <Button2 color="Hover" radius="Circle" />
      <Button2 color="Deactive" radius="Hard" />
      <Button2 color="Deactive" radius="Smooth" />
      <Button2 color="Deactive" radius="Circle" /> */}
      {["#1abc9c", "#16a085", "#2ecc71", "#27ae60", "#3498db"].map((v) => (
        <Box2 backcolor={v} />
      ))}
      {["#1abc9c", "#16a085", "#2ecc71", "#27ae60", "#3498db"]
        .reverse()
        .map((v) => (
          <Box2 backcolor={v} />
        ))}
      {/* <Box2 backcolor="red"></Box2>
      <Box2 backcolor="blue"></Box2>
      <Box2 backcolor="orange"></Box2>
      <Box2 backcolor="yellow"></Box2>
      <Box2 backcolor="skyblue"></Box2>
      <Box2 backcolor="pink"></Box2>
      <Box2 backcolor="green"></Box2>
      <Box2 backcolor="lightgray"></Box2> */}
    </section>
  );
};

export default GridLayout;
