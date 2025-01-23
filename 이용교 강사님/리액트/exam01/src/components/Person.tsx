'use client'

import { useState } from 'react'

type PersonType = {
  name: string
  age: number
}

const Person = () => {
  // data = 상태값, setData = 상태 변경 함수
  const [data, setData] = useState<PersonType>({
    name: '이이름',
    age: 20,
  })

  const { name, age } = data

  const onIncrease = () => {
    // data.age++
    // setData(data)

    // setData({ name, age: age + 1 })

    // setData({ ...data, age: age + 1 })

    // 함수형태 권장
    setData((state) => ({ ...state, age: state.age + 1 }))
  }

  const onDecrease = () => {
    // data.age--
    // setData(data)

    // setData({ name, age: age - 1 })

    // setData({ ...data, age: age - 1 })

    // 함수형태 권장
    setData((state) => ({ ...state, age: state.age - 1 }))
  }

  return (
    <div>
      <dl>
        <dt>이름</dt>
        <dd>{name}</dd>
      </dl>
      <dl>
        <dt>나이</dt>
        <dd>{age}</dd>
      </dl>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
    </div>
  )
}

export default Person
