// Class형 Component
'use client'

import { Component } from 'react'

// unknown = props, {number: number} = state
class Counter2 extends Component<unknown, { number: number }> {
  state: { number: number } = {
    number: 0,
  }

  render() {
    const { number } = this.state

    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          // onClick 안에는 반드시 함수 객체
          // setState 안의 객체는 새로운 객체, 기존 객체와 주소가 달라야함
          // onClick={() => this.setState({ number: number - 1 })}

          onClick={() =>
            // ({number : number -1}) 를 소괄호로 감싼 이유
            // 소괄호로 감싸지 않으면 구현체 판정
            // 소괄호로 감싸면 객체 판정
            this.setState(({ number }) => ({ number: number - 1 }))
          }
        >
          -1
        </button>
        <button
          type="button"
          // onClick 안에는 반드시 함수 객체
          // setState 안의 객체는 새로운 객체, 기존 객체와 주소가 달라야함
          // onClick={() => this.setState({ number: number + 1 })}

          onClick={() =>
            // ({number : number +1}) 를 소괄호로 감싼 이유
            // 소괄호로 감싸지 않으면 구현체 판정
            // 소괄호로 감싸면 객체 판정
            this.setState(({ number }) => ({ number: number + 1 }))
          }
        >
          +1
        </button>
      </>
    )
  }
}

export default Counter2
