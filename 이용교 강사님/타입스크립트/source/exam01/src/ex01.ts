// 변수 - 원시 타입
let num: number

num = 100
// num = 'ABC'
// num = false

// 변수 - Union 타입
let _name: string | number = '이름'

_name = 100
_name = '김시원'
// _name = true

// 변수 - 배열 객체 타입
let fruits: string[] = ['사과', '오렌지', '멜론']

fruits = ['포도']
// fruits = '사과'

// 변수 - 배열 객체 타입 / 요소 순서에 따른 설정
let data: [string, number] = ['이름', 40]

// data = [50, '이름']

// 변수 - 배열 객체 타입 / 순서 상관없이 문자형 || 숫자형 오는 타입
let data2: (string | number)[] = [40, '이름', '테스트']

// 변수 - 객체 타입
let person: { name: string; age: number } = { name: '이이름', age: 20 }

// person = { name: '김이름' }
