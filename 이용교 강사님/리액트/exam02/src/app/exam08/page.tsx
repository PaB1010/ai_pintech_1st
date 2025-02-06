// Context API 실습

'use client'

import ColorBox from './ColorBox'
import { ColorProvider } from './ColorContext2'

const Exam08Page = () => {
  return (
    <ColorProvider>
      <ColorBox />
    </ColorProvider>
  )
}

export default Exam08Page

/*
import { createContext } from 'react'
import Component1 from './Component1'

export const ColorContext = createContext({
  color: '',
})

const Exam08Page = () => {
  return //   전역 상태 범주, value 값 필수
  <ColorContext.Provider value={{ color: 'red' }}>
    <Component1 />
  </ColorContext.Provider>
}

export default Exam08Page
*/