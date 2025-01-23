// CSR로 동작, Next.js에서 React 기능 사용시 필수
'use client'

// @ = /src 패키지
// import Counter from '@/components/Counter'

import Greeting from '@/components/Greeting'
// import한 모듈 변수명은 변경 가능
import Greeting2 from '@/components/Greeting'

import { sum, subtract } from '@/components/Greeting'

// import { sum2, subtract2 } from '@/components/Greeting'

// 별칭 사용히 이름 변경 가능
import { sum2 as add, subtract2 } from '@/components/Greeting'

console.log(sum(10, 20), subtract(20, 10))

console.log(add(10, 20), subtract2(20, 10))

export default function MainPage() {
  // return <Counter />

  return (
    <>
      <Greeting />
      <Greeting2 />
    </>
  )
}
