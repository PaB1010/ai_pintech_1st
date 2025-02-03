'use server' // server side 동작, REST template처럼 소켓으로 Server에 전송

// header에 Location 추가하는 방식
import { redirect } from 'next/navigation'

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
    const res = await fetch('https://member-service.koreait.xyz/join', {
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

export const processLogin = async (formState, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) Server쪽에 처리 요청 전송
   * 2-1) 이상 있을 경우 Error
   * 3) 이상 없을시 후속 처리 -> 이전 페이지 이동
   */

  let errors = {}
  let hassErrors = {}

  /* 1) 필수 항목 검증 S */
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
    /* 1) 필수 항목 검증 E */

    /* 2) Server쪽에 처리 요청 전송 S */
    const form = {}

    for (const [key, value] of formData.entries()) {
      if (['email', 'password'].includes(key)) {
        form[key] = value
      }
    }

    try {
      const res = await fetch('https://member-service.koreait.xyz/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(form),
      })

      if (res.status != 201) {
        const result = await res.json()
        if (!result.success) {
          errors = result.message
          hassErrors = true
        }
      }
    } catch (err) {
      console.error(err)
    }

    if (hassErrors) {
      return errors
    }
    /* 2) Server쪽에 처리 요청 전송 E */
  }

  redirect('/member/mypage')
}
