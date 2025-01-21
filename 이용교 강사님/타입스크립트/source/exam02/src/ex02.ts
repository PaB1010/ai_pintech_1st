/* 타입 어서션 - as, 형변환 */

let num = 100

console.log(typeof num) // number

let str = num as unknown as string

console.log(str.toUpperCase)

/* 타입 Alias */
type Position = {
  lat: number
  lon: number
}

type Address = {
  zipcode: string
  address: string
}

// Position 타입이거나 Address 타입 한정
type PositionOrAddress = Position | Address

// Position 타입 + Address 타입 둘 다 필수로 한정
type PositionAndAddress = Position & Address

const type1: PositionOrAddress = { lat: 31, lon: 127 }
const type2: PositionOrAddress = { zipcode: '집코드', address: '주소' }

const type3: PositionAndAddress = {
  lat: 31,
  lon: 127,
  zipcode: '집주소',
  address: '주소',
}

/*
function printPosition(position: Position) {
  console.log(`위도: ${position.lat}, 경도: ${position.lon}`)
}

printPosition({ lat: 32.1112, lon: 127.123 })
*/

/* 타입 형변환 */
let loc = {}

loc = loc as unknown as Position

console.log(loc)