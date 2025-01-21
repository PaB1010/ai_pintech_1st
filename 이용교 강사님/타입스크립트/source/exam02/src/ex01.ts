/* Union 타입 - |, & */

let fruits: string[] = ['사과', '오렌지', '바나나']

let fruits2: (string | number | boolean)[] = ['사과', '오렌지', 2000, true]

/* 객체 타입 */

let person: { name: string; age: number }

person = { name: '김시원', age: 28 }

// person = { name = '김서연' }

/* 옵셔널 체이닝 ? - 타입은 한정하지난 필수는 아닌 속성 */

let person2: { name: string; age?: number }

person2 = { name: '김시원' }

/* any 타입 */
let a: any

a = 100
a = 'ABC'

/* unknown 타입 */
let b: unknown

b = 'ABC'

// b.toUpperCase() // 에러 발생, 타입 체크가 반드시 필요 (unkown 타입이라서)

if (typeof b === 'string') {
  b.toUpperCase()
}

/* 함수 타입 */
function printName(name: string, formatter: (name: string) => string): void {
  console.log(formatter(name))
}

printName('이이름', (name) => `${name}님`)

