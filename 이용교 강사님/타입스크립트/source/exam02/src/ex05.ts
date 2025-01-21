import { Dir } from 'fs'

enum Direction {
  UP,
  DOWN,
  LEFT,
  RIGHT,
}

const dir = Direction.DOWN

console.log(dir) // 값이 1, 상수가 정의된 순서 번호 (JAVA의 Ordinal 값과 유사)

const value = 'DOWN'

const dir2 = value as unknown as Direction
// console.log(value === dir)

console.log(dir2 === dir)

