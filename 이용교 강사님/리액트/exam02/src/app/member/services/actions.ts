'use server' // server side 동작, REST template처럼 소켓으로 Server에 전송

// header에 Location 추가하는 방식
import { redirect } from 'next/navigation'
import { cookies } from 'next/headers'

/**
 * 회원 가입 처리
 *
 * @param formState
 * @param formData
 * @returns
 */
// Server쪽 Action함수는 항상 비동기 함수여야함!
export const processJoin = async (formState, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) 비밀번호와 비밀번호 확인 일치 여부
   * 3) Server쪽에 처리 요청 전송
   * 3-1) 이상 있을 경우 Error
   * 4) 이상 없을시 후속 처리 -> 로그인 페이지 이동
   */

  let errors = {}
  let hassErrors = false

  /* 1) 필수 항목 검증 S */
  const requiredFields = {
    email: '이메일을 입력하세요.',
    password: '비밀번호를 입력하세요.',
    confirmPassword: '비밀번호를 확인하세요.',
    name: '회원명을 입력하세요',
  }

  // entry = Key & Value 쌍 형태
  // field = Key, msg = Value
  for (const [field, msg] of Object.entries(requiredFields)) {
    // 값이 없는 경우 대비, 빈 공백 형태 등
    const value = formData.get(field)

    if (!value || !value?.trim()) {
      errors[field] = errors[field] ?? []

      errors[field].push(msg)
    }
  }
  /* 1) 필수 항목 검증 E */

  /* 2) 비밀번호와 비밀번호 확인 일치 여부 S */
  const password = formData.get('password')

  const confirmPassword = formData.get('confirmPassword')

  // 존재할 경우에만 체크
  if (
    password &&
    password?.trim() &&
    confirmPassword &&
    confirmPassword?.trim() &&
    password !== confirmPassword
  ) {
    // confirmPassword 가 없을 경우 빈 배열
    errors.confirmPassword = errors.confirmPassword ?? []
    errors.confirmPassword.push('비밀번호가 일치하지 않습니다.')
  }
  /* 2) 비밀번호와 비밀번호 확인 일치 여부 E */

  /* 3) Server 쪽에 처리 요청 S */

  // JSON 형태 = Key & Value 쌍 형태
  const form = {}

  for (const [key, value] of formData.entries()) {
    // key에 포함되었을 경우에만 처리
    if (['email', 'password', 'confirmPassword', 'name'].includes(key)) {
      form[key] = value
    }
  }

  form.requiredTerms1 = true
  form.requiredTerms2 = true
  form.requiredTerms3 = true

  try {
    // fetch
    const res = await fetch('https://cis-member-service.koreait.xyz/join', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(form),
    })

    if (res.status != 201) {
      // 처리 실패 -> 에러 출력
      const result = await res.json()
      if (!result.success) {
        errors = result.message
        hassErrors = true
      }
    }
    // console.log('res', res)
    // const json = await res.json()
    // console.log('json', json)
    // console.log('유입!')
  } catch (err) {
    console.error(err)
  }

  if (hassErrors) {
    // errors 값으로 넘어옴
    return errors
  }
  // 회원 가입 성공시 로그인 페이지로 이동 (redirect 함수 이용)
  redirect('/member/login')

  /* 3) Server 쪽에 처리 요청 E */
}

/**
 * 로그인 처리
 *
 * @param form
 * @param formData
 * @returns
 */
export const processLogin = async (form, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) Server쪽에 처리 요청 전송
   * 2-1) 이상 있을 경우 Error
   * 3) 이상 없을시 후속 처리 -> 지정된 주소 | 메인 페이지 이동
   */

  const errors = {}
  let hasErrors = false

  /* 1) 필수 항목 검증 S */
  const email = formData.get('email')
  const password = formData.get('password')

  if (!email || !email.trim()) {
    errors.email = errors?.email ?? []
    errors.email.push('이메일을 입력하세요.')
    hasErrors = true
  }

  if (!password || !password.trim()) {
    errors.password = errors?.password ?? []
    errors.password.push('비밀번호를 입력하세요.')
    hasErrors = true
  }

  if (hasErrors) return errors

  /*
  const requiredFields = {
    email: '이메일을 입력하세요.',
    password: '비밀번호를 입력하세요.',
  }

  for (const [field, msg] of Object.entries(requiredFields)) {
    const value = formData.get(field)

    if (!value || !value?.trim()) {
      errors[field] = errors[field] ?? []

      errors[field].push(msg)
    }
  */

  /* 1) 필수 항목 검증 E */

  /* 2) Server쪽에 처리 요청 전송 S */
  const apiUrl = process.env.API_URL + '/member/login'
  // const apiUrl = process.env.API_URL + '/member-service/login'

  for (const [key, value] of formData.entries()) {
    if (['email', 'password'].includes(key)) {
      form[key] = value
    }
  }

  try {
    const res = await fetch(apiUrl, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ email, password }),
    })

    const result = await res.json()

    if (result.success) {
      // 성공시
      const cookie = await cookies()
      cookie.set('token', result.data, {
        httpOnly: true,
        sameSite: 'none',
        secure: true,
        path: '/',
      })
    } else {
      // 실패시

      return result.message
    }
  } catch (err) {
    console.error(err)
  }

  /* 2) Server쪽에 처리 요청 전송 E */

  redirect('/')
}

/**
 * 현재 로그인한 사용자 정보 조회
 *  - token cookie로 Server에 요청
 *  - Authorization Header
 */
export const getUserInfo = async () => {
  const cookie = await cookies()

  const token = cookie.get('token')

  if (!token || !token.value) return

  try {
    const apiUrl = process.env.API_URL + '/member'
    // const apiUrl = process.env.API_URL + '/member-service'
    const res = await fetch(apiUrl, {
      method: 'GET',
      headers: {
        Authorization: `Bearer ${token.value}`,
      },
    })

    if (res.status === 200) {
      const result = await res.json()
      return result.data
    }
  } catch (err) {
    console.error(err)
  }
}
