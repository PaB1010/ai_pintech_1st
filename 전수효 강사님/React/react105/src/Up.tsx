import React, { useState } from "react";

const Up = () => {
  const [num, setNum] = useState(0);

  const addOne = () => {
    setNum((prev) => {
      return prev + 1;
    });
  };
  return <button onClick={() => setNum((prev) => prev + 1)}>{num}</button>;
};

export default Up;
