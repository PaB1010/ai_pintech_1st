import Button from "./Button";
// import ButtonLayout from "./ButtonLayout";
import Circle from "./Circle";
// import CircleLayout from "./CircleLayout";

function App() {
  return (
    <>
      <Circle CircleColor="red"></Circle>
      <Button ButColor="Primary" ButRad="Hard"></Button>
      {/* <ButtonLayout repeat={3}></ButtonLayout>
      <CircleLayout repeat={5}></CircleLayout> */}
    </>
  );
}

export default App;
