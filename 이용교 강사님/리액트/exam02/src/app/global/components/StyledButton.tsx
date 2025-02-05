// Styled=Components 실습

'use client'

import styled, { css } from 'styled-components'

// button이라는 Element가 만들어지고 Tagged 문법 안에 있는 Style 적용
export const Button = styled.button`
  height: 80px;
  min-width: 200px;
  border: 0;
  background: ${({ color }) => color ?? 'black'};
  color: #fff;
`

// color props를 비구조 할당으로 가져옴