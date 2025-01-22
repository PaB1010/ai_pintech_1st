import type { Metadata } from 'next'

// 메타 태그에 추가 & 치환될 내용
export const metadata: Metadata = {
  title: 'Next.js 연습',
  description: '설명...',
}

type PropType = {
  children: React.ReactNode
}

// 모든 사이트의 공통 자원 부분
export default function MainLayout({ children } : Readonly<PropType>) {

  return (
    <html>
      <head></head>
      <body>
        <h1>메인 레이아웃</h1>
        {children}
      </body>
    </html>
  )
}