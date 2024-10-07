import React, { useState } from "react";

// react19 -state

// Up.tsx -> 숫자 0버튼, 클릭하면 숫자가 1씩 올라가는 컴포넌트
// conter.tsx
// -버튼 0버튼 +버튼
// 0보다 낮게는 ㄴㄴ
// 10개이상되면 버튼의 배경색이 빨간색으로
const Button = () => {
  const [food, setFood] = useState("마라탕");

  const abc = () => {
    setFood((prev) => {
      return prev + "후루 사주세요";
    });
  };

  // 결과 값 "마라탕" ->(클릭)-> "마라탕후루 사주세요"

  return <button onClick={abc}>{food}</button>;
};

export default Button;
