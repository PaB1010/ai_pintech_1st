package org.koreait.member.repositories.sub;

import org.springframework.stereotype.Repository;

@Repository("memRepo2")
// Annotation value값으로 beanName 지정
public class MemberRepository {
    // beanName = memberRepository
    // Class명이 기준!
}