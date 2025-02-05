// useMemo 실습, 숫자를 계속 합산하는 함수

'use client'

import { useState, useMemo, useCallback } from 'react'

function getTotal(numbers: number[]) {
  console.log('호출!')
  return numbers && numbers.length > 0 ? numbers.reduce((a, b) => a + b) : 0
}

const Exam03Page = () => {
  const [numbers, setNumbers] = useState<number[]>([])

  const [number, setNumber] = useState<number | undefined>()

  const handleChange = useCallback((e) => setNumber(e.target.value), [])
  

  const handleClick = useCallback(() => {
    if (number && !isNaN(number)) {
      // 변화감지 기준인 numbers를 새로운 객체로 만들어
      // 주소가 바뀌어야 하므로 put 사용하지 않고 concat 사용
      // 불변성 유지
      setNumbers((numbers) => numbers.concat(Number(number)))
    }
    // console.log('number', number, 'numbers', numbers)
  }, [number])

  // numbers가 바뀔때만 호출되도록
  // useMemo쓰지 않으면 numbers에 한글자씩 입력하는 중에도 계속 Rerendering 되어 비효율적
  const total = useMemo(() => getTotal(numbers), [numbers])

  return (
    <>
      <input type="number" onChange={handleChange} />
      <button type="button" onClick={handleClick}>
        더하기
      </button>
      <ul>
        {numbers.map((num, i) => (
          <li key={num + '_' + i}>{num}</li>
        ))}
      </ul>
      <div>합계 : {total}</div>
    </>
  )
}

export default Exam03Page
