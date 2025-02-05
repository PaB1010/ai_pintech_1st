'use client'

import { FaRegSquareCheck, FaSquareCheck } from 'react-icons/fa6'
import { Button } from '@/app/global/components/StyledButton'

const JoinForm = ({ actionState, onChange, onToggle, form }) => {
  // 1번째 매개변수 = 반환값, 2번째 매개변수 = Server Side로 감싼 함수, 3번째 매개변수=제출시 true됨, action 중복 제출 방지
  // 첫번째 매개변수로 에러 처리, 성공시 등등 정의 가능
  const [errors, formAction, isPending] = actionState
  return (
    <>
      <form action={formAction}>
        <dl>
          <dt>이메일</dt>
          <dd>
            <input
              type="text"
              name="email"
              onChange={onChange}
              value={form.email ?? ''}
            />
            {errors?.email && errors.email.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>비밀번호</dt>
          <dd>
            <input
              type="password"
              name="password"
              onChange={onChange}
              value={form.password ?? ''}
            />
            {/* <input type="password" name="password"/> */}
            {errors?.password &&
              errors.password.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>비밀번호 확인</dt>
          <dd>
            <input
              type="password"
              name="confirmPassword"
              onChange={onChange}
              value={form.confirmPassword ?? ''}
            />
            {/* <input type="password" name="confirmPassword" /> */}
            {errors?.confirmPassword &&
              errors.confirmPassword.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>회원명</dt>
          <dd>
            <input
              type="text"
              name="name"
              onChange={onChange}
              value={form.name ?? ''}
            />
            {errors?.name && errors.name.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <div onClick={onToggle}>
          {form?.agree ? <FaSquareCheck /> : <FaRegSquareCheck />}
          회원가입 약관에 동의합니다.
        </div>

        {/* 제출시 isPending=true되고 버튼 비활성화, action 중복 제출 방지 */}
        <Button type="submit" disabled={isPending} color="pink" Border={true}>
          가입하기
        </Button>
      </form>
    </>
  )
}

export default JoinForm
