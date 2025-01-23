import MyComponent from '@/components/MyComponent'
import MyComponent2 from '@/components/MyComponent2'

const Exam01Page = () => {
  return (
    <>
      <MyComponent name="최이름" num={10}>
        <p>글을 입력하겠습니다...</p>
      </MyComponent>
      <MyComponent2 name="김이름">
        <p>글을 입력할까요...</p>
      </MyComponent2>
    </>
  )
}

export default Exam01Page