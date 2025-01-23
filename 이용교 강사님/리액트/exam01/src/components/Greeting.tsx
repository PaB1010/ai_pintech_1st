import '../styles/greeting.css'
// import '@/styles/greeting.css'

const Greeting = () => {
  const name = '이이름'
  const date = new Date()
  const visible = true
  // 복잡한 조건 로직 필요시 JSX내부가 아닌 이곳에 정의

  /*
  const style = {
    backgroundColor: 'skyblue',
    color: 'blue',
  }
    */

  return (
    // JSX 문법, 한줄시 소괄호 생략 가능
    <>
      <h1 // 한줄 주석
        className="title"
      >
        {name}님 반갑습니다.
      </h1>
      {/*
      <h1 style={{ backgroundColor: 'skyblue', color: 'blue' }}>
        {name}님 반갑습니다.
      </h1> */}

      {/* 간단한 함수 호출 가능 */}

      {/* 삼항 조건은 중괄호 안에, true시 출력되는 부분이 한줄 이상일 경우 소괄호로 감싸야 함 */}
      {/* false시 undefined, null, '' 등 가능 */}
      {/* {visible ? <h2>현재 시간 : {date.toLocaleString()}</h2> : ''} */}

      {/* 단락회로 평가 이용 */}
      {visible && <h2>현재 시간 : {date.toLocaleString()}</h2>}
    </>
  )
}

const sum = (a, b) => a + b
const subtract = (a, b) => a - b

export const sum2 = (a: number, b: number): number => a + b
export const subtract2 = (a: number, b: number): number => a - b

export { sum, subtract }

export default Greeting