'use client'

import LoginForm from '../components/LoginForm'
import { processLogin } from '../services/actions'
import React, { useActionState, useState } from 'react'
import styled from 'styled-components'

const StyledLoginForm = styled(LoginForm)`
  border : 10px solid orange;
`

type FormType = {
  email?: string
  password?: string
}

const LoginContainer = () => {
  const [form, setForm] = useState<FormType>({})

  const handleChange = (e) => {
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))
  }

  const actionState = useActionState(processLogin, {})

  return (
    <StyledLoginForm
      actionState={actionState}
      onChange={handleChange}
      form={form}
    />
  )
}

export default React.memo(LoginContainer)
