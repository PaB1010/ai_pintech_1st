// useMemo 예제

'use client'

import { useMemo } from 'react'

const A = () => {
  useMemo(() => {}, [])

  return (
    <>
      <h1></h1>
    </>
  )
}

export default A