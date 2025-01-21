// Index 타입 - 객체의 키값인 code는 숫자로 한정

type ResponseCode = {
  [code: number]: string
}

const _res: ResponseCode = {
  200: 'OK',
  400: 'BAD REQUEST',
  401: 'UNAUTHORIZED',
}

type ResopnseCode2 = {
  [code: string]: number
}

const _res2: ResopnseCode2 = {
  OK: 200,
}
