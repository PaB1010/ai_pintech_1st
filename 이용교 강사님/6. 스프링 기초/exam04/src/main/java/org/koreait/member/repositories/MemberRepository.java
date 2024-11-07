package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MemberRepository extends ListCrudRepository<Member, Long> {

    // 추상 메서드로 query문 (email로 조회 목적)
    Member findByEmail(String email);

    List<Member> findByUsernameContainingOrderBySeqDesc(String keyword);
}