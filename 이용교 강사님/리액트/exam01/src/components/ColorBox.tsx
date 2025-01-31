'use client'

import { useState, useLayoutEffect } from 'react'

/*
const ColorBox = (): React.ReactNode => {
    // React는 일반 DOM과 다르게 이벤트를
    // 함수 객체로 실행 지연 필수
    const handleClick = () => alert("테스트");

    return <button onClick={handleClick}>클릭</button>

  // 정의와 동시에 사용한 경우
  // DOM이 아닌 JSX 객체
  // return <button onClick={() => alert('테스트')}>클릭</button>
}
*/
const colors: string[] = ['gray', 'red', 'blue', 'green', 'skyblue', 'orange']

const ColorBox = (): React.ReactNode => {
  const [selected, setSelected] = useState<string>('gray')

  const handleClick = (color) => setSelected(color)

  return (
    <>
      <ColorTabs onClick={handleClick}></ColorTabs>
      <div
        style={{
          background: selected,
          width: 300,
          height: 300,
          border: '1px solie #000',
        }}
      ></div>
    </>
  )
}

const ColorTabs = ({onClick}) => {
  const tabStyle = {
    display: 'flex',
    height: 100,
    width: 500,
  }
  return (
    <div style={tabStyle}>
      {colors.map((color) => (
        <div
          key={color}
          style={{ background: color, width: 0, flexGrow: 1 }}
        ></div>
      ))}
    </div>
  )
}

export default ColorBox
