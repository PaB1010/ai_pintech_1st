'use client'

import { useState } from 'react'

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

  const [border, setBorder] = useState<string>('black')

  const handleClick = (color) => setSelected(color)

  const handleChange = (e) => {
    console.log('타이핑!', this)
    console.log('입력한 값 : ', e.target.value)
    console.log('이벤트 발생 요소 : ', e.target)
    setBorder(e.target.value)
  }

  // console.log('렌더링!', selected)

  return (
    <>
      <ColorTabs onClick={handleClick}></ColorTabs>
      <input
        type="text"
        placeholder="색상을 입력하세요"
        onChange={handleChange}
      ></input>
      <div
        style={{
          background: selected,
          width: 300,
          height: 300,
          borderWidth: 10,
          borderStyle: 'solid',
          borderColor: border,
        }}
      ></div>
    </>
  )
}

// 속성에 불과
const ColorTabs = ({ onClick }) => {
  const tabStyle = {
    display: 'flex',
    height: 100,
    width: 500,
  }
  return (
    <div style={tabStyle}>
      {colors.map((color) => (
        <div
          onClick={() => onClick(color)}
          key={color}
          style={{ background: color, width: 0, flexGrow: 1 }}
        ></div>
      ))}
      {}
    </div>
  )
}

export default ColorBox
