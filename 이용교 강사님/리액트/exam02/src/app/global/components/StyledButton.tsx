// Styled=Components 실습

'use client'

import styled, { css } from 'styled-components'

const commonStyle = css`
  height: 80px;
  color: #fff;
`

// button이라는 Element가 만들어지고 Tagged 문법 안에 있는 Style 적용
export const Button = styled.button`
  min-width: 200px;
  border: 0;
  background: ${({ color }) => color ?? 'black'};
  ${({ Border }) =>
    Border &&
    css`
      border: 10px solid lightblue;
      color: orange;
    `}
`

// color props를 비구조 할당으로 가져옴

export const Button2 = styled.button`
  ${commonStyle}
`
