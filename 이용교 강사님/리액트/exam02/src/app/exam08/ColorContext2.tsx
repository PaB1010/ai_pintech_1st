// 상태 관리도 같이하는 Context API 실습
// Provider를 Custom해서 상태 관리도 같이하도록
// Redux 형태

'use client'

import { createContext, useState } from 'react'

const ColorContext2 = createContext({
  // 상태, 상태 변경 함수

  state: { color: undefined },

  actions: { setColor: undefined },
})

// 상태 값이 바뀌면 전역에서 Rerendering
// useMemo 사용시 Comsumer에서 사용하는 상태 값 변경이 없을 경우는 Rerendering 되지 않음
const ColorProvider = ({ children }) => {
  const [color, setColor] = useState<string | undefined>()

  const value = {
    state: { color },
    actions: { setColor },
  }

  return <ColorContext2.Provider value={value}>{children}</ColorContext2.Provider>
}

const { Consumer: ColorConsumer } = ColorContext2

export { ColorProvider, ColorConsumer }

export default ColorContext2
