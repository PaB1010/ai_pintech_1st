// Class형 Component

'use client'

import { Component } from 'react'

type PropType = {
  name?: string | undefined
  num?: number
  children: React.ReactNode
}

class MyComponent extends Component<PropType> {
  render() {
    // 부모 Component가 넘겨준 속성은 this.props에서 확인 가능
    // console.log(this.props)

    // 자식에서 속성값 변경 불가
    // this.props.name = '변경 이름'
    // this props = 객체 동결 상태 - 부모 Component에서만 값 변경 가능, 자식 Component는 변경 불가
    console.log(Object.getOwnPropertyDescriptors(this.props))

    // 객체 속성 추가 가능 여부 - 불가(false)
    console.log(Object.isExtensible(this.props))

    // 객체 동결 상태(true) - 부모쪽 속성 값은 자식에게 변경 불가하게 통제 되고 있음
    console.log(Object.isFrozen(this.props))

    // ?? nullish 연산자 사용으로 기본값 설정
    // const name = this.props.name ?? '기본 이름'

    // 비구조 할당으로 많이 사용
    const { name, children } = this.props

    // name = name ?? '기본 이름'

    console.log('children', children)

    return (
      <>
        <h1>나의 짱 멋진 클래스형 컴포넌트</h1>
        <h2>{name}님 반갑습니다</h2>
        {children}
      </>
    )
  }
}

export default MyComponent
