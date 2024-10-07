// Box 넓이 높이 백그라운드(레드블루그린오렌지) 글
import Box from "./Box";

function App() {
  return (
    <div>
      <Box backgroundcolor="red" height="100px" width="100px" text="레드" />
      <Box backgroundcolor="blue" height="150px" width="150px" text="블루" />
      <Box backgroundcolor="green" height="200px" width="200px" text="그린" />
      <Box
        backgroundcolor="orange"
        height="250px"
        width="250px"
        text="오렌지"
      />
    </div>
  );
}

export default App;
