// 보이는 화면, Presentational Component
'use client'

import { FaRegSquareCheck, FaSquareCheck } from 'react-icons/fa6'

const JoinForm = ({ onSubmit, onChange, onToggle, form }): React.ReactNode => {
  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>이메일</dt>
        <dd>
          <input
            type="text"
            name="email"
            onChange={onChange}
            value={form.email}
            readOnly={true}
          ></input>
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={onChange}
          ></input>
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPassword"
            value={form.confirmPassword}
            onChange={onChange}
          ></input>
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={onChange}
          ></input>
        </dd>
      </dl>
      <div onClick={onToggle}>
        {form.agree ? <FaSquareCheck /> : <FaRegSquareCheck />} 회원 가입 약관에
        동의합니다.
      </div>
      <button type="submit">가입하기</button>
    </form>
  )
}

export default JoinForm
