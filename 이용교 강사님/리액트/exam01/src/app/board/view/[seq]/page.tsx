export default async function BoardViewPage({ params, searchParams }) {
  // 경로 변수
  console.log('params', params)

  // 쿼리 스트링
  console.log('searchParams', searchParams)

  const { seq } = await params

  console.log('seq', seq)

  const { t1, t2 } = await searchParams

  console.log('query', t1, t2)

  return <h1>게시글 보기 페이지...</h1>
}