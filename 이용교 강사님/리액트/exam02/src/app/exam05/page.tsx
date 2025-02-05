// ClassNames 실습

'use client'

import { useState, useCallback } from 'react'
import classNames from 'classnames'

const Exam05Page = () => {
  const [clicked, setClicked] = useState<boolean>(false)

  const handleToggle = useCallback(() => setClicked((clicked) => !clicked), [])

  // 클릭하면 className에 on 추가하기
  return (
    <button
      type="button"
      onClick={handleToggle}
      // clicked=true 일 경우 on 추가, 여러개도 가능
      // 'btn' 그냥 추가되는 클래스명
      className={classNames('btn', { on: clicked })}
    >
      클릭
    </button>
  )
}

export default Exam05Page
