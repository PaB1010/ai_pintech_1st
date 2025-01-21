/* interface */
interface Print {
  print: () => void
}

interface Position2 {
  lat: number
  lon: number
}

interface Address2 {
  zipcode?: string
  address: string
}

const loc2: Position2 & { address: string } = {
  lat: 31,
  lon: 127,
  address: '주소',
}

const loc3: Position2 & Address2 = {
  lat: 31,
  lon: 127,
  address: '주소',
}

class Restaurant implements Position2, Print {
  lat: number
  lon: number

  constructor(lat: number, lon: number) {
    // 초기화
    this.lat = lat
    this.lon = lon
  }

  print() {
    console.log(this.lat, this.lon)
  }
}

const res = new Restaurant(31.123, 127.123)

res.print()
