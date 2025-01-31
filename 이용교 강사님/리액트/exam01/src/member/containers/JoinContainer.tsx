// Data 처리담당 Container Component

'use client'

import { useState } from 'react'

import JoinForm from '../components/JoinForm'

type FormType = {
  email?: string
  password?: string
  confirmPassword?: string
  name?: string
  agree?: boolean
}

const JoinContainer = (): React.ReactNode => {
  const [form, setForm] = useState<FormType>({ email: 'user01@test.org' })

  const handleChange = (e) => {
    // 깊은 복사한 새 객체로 주소값 변경해 리렌더링 유도
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  const handleToggle = () => {
    setForm({ ...form, agree: !Boolean(form.agree) })
  }

  /**
   * 양식 제출시 처리 함수
   */
  const onSubmit = (e) => {
    // 1. form 태그의 기본 동작 차단
    e.preventDefault()

    /**
     * 2. 양식 검증
     *
     * 1) 필수 항목 검증
     * 2) 비밀번호, 비밀번호 확인 일치여부, 자리수 체크 등
     *
     * 중복 검증등은 프론트에서 ㄴㄴ
     */
  }
  return (
    <>
      <JoinForm
        onSubmit={onSubmit}
        onChange={handleChange}
        form={form}
        onToggle={handleToggle}
      />
    </>
  )
}

export default JoinContainer
