// Never 타입

function validate(): never {
  throw new Error('테스트 예외')
}

// keyof 연산자

interface Person {
  name: string
  age: number
  address: string
}

// 'name' | 'age' | 'address'
type PersonKey = keyof Person

const key: PersonKey = 'name'
const key2: PersonKey = 'age'

const person3 = {
  name: '이이름',
  age: 40,
  zipcode: '01111',
}
/*
for (const key in person3) {
  const k1: PersonKey = key
  console.log(key)
}
*/
