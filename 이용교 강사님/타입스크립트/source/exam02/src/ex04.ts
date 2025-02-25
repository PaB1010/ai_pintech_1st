abstract class Animal {
  // private species: string
  protected species: string

  constructor(species: string) {
    this.species = species
  }

  move(): void {
    console.log('움직인다')
  }
}

// const animal = new Animal()
// animal.move()

class Human extends Animal {
  public name: string

  constructor(name: string) {
    super('인류')
    this.name = name
    // super(species)
    this.species
  }

  move(): void {
    console.log('두발로 직립보행')
  }
}

const human = new Human('김이름')

human.move()

// 현재 species가 protected이므로 하위 클래스 내부만 접근 가능, 외부는 접근 불가로 오류
// console.log(human.species, human.name)