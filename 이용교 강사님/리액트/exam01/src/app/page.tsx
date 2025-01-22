// CSR로 동작, Next.js에서 React 기능 사용시 필수
'use client'

// @ = /src 패키지
import Counter from '@/components/Counter'

export default function MainPage() {
  return <Counter />
}