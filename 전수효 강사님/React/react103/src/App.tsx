import Box from "./Box";
import Button from "./Button";
import Button2 from "./Button2";
import GridLayout from "./GridLayout";

function App() {
  return (
    <>
      {/* <Button color="red" padding="10px 20px" text="정지" />
      <Button color="yellow" padding="30px 10px" text="주의" />
      <Button color="green" padding="50px 50px" text="통행" />
      <Box backgroundcolor="pink" size="medium" />
      <Box backgroundcolor="skyblue" size="large" />
      <Box backgroundcolor="orange" size="small" /> */}
      {/* <Button2 color="Primary" radius="Hard" />
      <Button2 color="Primary" radius="Smooth" />
      <Button2 color="Primary" radius="Circle" />
      <Button2 color="Hover" radius="Hard" />
      <Button2 color="Hover" radius="Smooth" />
      <Button2 color="Hover" radius="Circle" />
      <Button2 color="Deactive" radius="Hard" />
      <Button2 color="Deactive" radius="Smooth" />
      <Button2 color="Deactive" radius="Circle" /> */}
      <GridLayout repeat={5} />
    </>
  );
}

export default App;
