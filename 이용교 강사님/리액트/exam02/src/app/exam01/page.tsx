// React에서 지역 변수 쓰면 안되는 이유

'use client'

import { useState, useRef, useEffect } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(0)

  let num = useRef(1)

  // console.log('Counter() 호출!')

  useEffect(() => {
    console.log('useEffect()')
    console.log('number', number)

    return () => {
        console.log('뒷정리 함수 - 언마운트(Rerendering 되기 직전)시에 호출')
    }
  }, [number])


  const onIncrease = () => {
    setNumber(number + 1)
    num.current++
  }

  // console.log('num', num)

  return (
    <>
      <h1>{number}</h1>
      <button onClick={() => setNumber(number - 1)}>-1</button>
      <button onClick={onIncrease}>+1</button>
    </>
  )
}

export default Counter
