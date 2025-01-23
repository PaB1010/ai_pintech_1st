// 함수형 Component

type PropType = {
  name?: string | undefined
  children: React.ReactNode
}

const MyComponent2 = (props: PropType) => {
  // console.log('props', props)

  const { name, children } = props
  return (
    <>
      <h1>나의 조금 멋진 함수형 컴포넌트</h1>
      <h2>{name}님 반갑습니다</h2>
      {children}
    </>
  )
}

export default MyComponent2
