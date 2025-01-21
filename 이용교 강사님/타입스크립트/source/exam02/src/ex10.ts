// readOnly

type Person3 = {
  name: string

  // 읽기 전용, 변경 불가, 삭제 불가
  // 데이터 프로퍼티 : writable: false, configurable: false
  readonly age: number
}

const person4: Person3 = {
  name: '이이름',
  age: 40,
}

// readonly라서 변경 불가 오류
// person4.age = 50

// 필수니까 삭제도 불가
// delete person.age

// console.log(Object.getOwnPropertyDescriptors(person4))

// 전체 person 객체를 읽기 전용으로 변경
type PersonReadonly = Readonly<Person3>

const person5: PersonReadonly = {
  name: '이이름',
  age: 40,
}

// 객체 전체가 readOnly라서 변경 불가
// person5.name = '김이름'
// person5.age = 20
