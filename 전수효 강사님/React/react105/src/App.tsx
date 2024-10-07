import Button from "./Button";
import Up from "./Up";
import Counter from "./Counter";
import Bee from "./Bee";
import { useState } from "react";
import Test from "./Test";
import Cafe from "./Cafe";

function App() {
  // const [total, setTotal] = useState({ hair: 1, eng: 1 });

  // const changeTotla = (target: any, count: number) => {
  //   setTotal((prev) => {});
  // };

  return (
    <>
      {/* <Button></Button>
      <Up></Up> */}
      {/* <Counter></Counter> */}
      <Bee name="아이보리 / FREE" price={15500}></Bee>
      <Bee name="차콜 / FREE" price={10000}></Bee>
      {/* <div>총 개수 : {total.hair + total.eng}</div> */}
      <Test></Test>
      <Cafe></Cafe>
    </>
  );
}

export default App;
