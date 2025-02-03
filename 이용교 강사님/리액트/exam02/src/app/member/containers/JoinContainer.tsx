'use client'
import JoinForm from '../components/JoinForm'
import { processJoin } from '../services/actions'
import { useActionState, useState } from 'react'

type FormType = {
  email?: string
  password?: string
  confirmPassword?: string
  name?: string
  agree?: boolean
}

const JoinContainer = () => {
  const [form, setForm] = useState<FormType>({})

  // server side action을 useActionState로 감싸서 사용하기!!!!
  const actionState = useActionState(processJoin, {})

  const handleChange = (e) => {
    // change Event마다 값 수집
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))
  }

  const handleToggle = () => {
    setForm((form) => ({ ...form, agree: !Boolean(form.agree) }))
  }

  return (
    <JoinForm actionState={actionState} onChange={handleChange} onToggle={handleToggle} form={form} />
  )
}

export default JoinContainer
