import { useState, Fragment } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(1)

  console.log('렌더링')

  return (
    <Fragment>
      <h1>{number}</h1>
      <button onClick={() => setNumber(number - 1)}>-1</button>
      <button onClick={() => setNumber(number + 1)}>+1</button>
    </Fragment>
  )
}

export default Counter
