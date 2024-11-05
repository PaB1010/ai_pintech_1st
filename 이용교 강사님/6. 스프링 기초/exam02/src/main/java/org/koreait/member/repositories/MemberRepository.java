// Data Object

package org.koreait.member.repositories;

import org.koreait.global.configs.ManualBean;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.entities.Member;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 DB에 영구 저장 처리 OR 조회 OR 삭제 처리
 */
@Repository
@ManualBean // 직접 만든 배제 Annotation
public class MemberRepository {
// MemberRepository BeanName = memberRepository
// Class명이 기준!!!


    // 반드시 내가 생성한 entities에 있는 Member 가져오기
    private static final Map<String, Member> members = new HashMap<>();
    
    // 다형성을 위해 save로 만들어 수정도 하긴하지만 아직은 안배웠으니 일단 register로 이름
    public void register(RequestJoin form) {

        String email = form.getEmail();
        
        Member member = new Member();
        
        // Stream 배웠을 경우 마지막 seq 번호 가져와서 증가시키도록
        // 아직 배우기 전이라 임시로 시간으로 설정
        member.setSeq(System.currentTimeMillis());
        member.setEmail(email);
        member.setPassword(form.getPassword());
        member.setUserName(form.getUserName());
        member.setRegDt(LocalDateTime.now());


        // email = key
        // member = value(data)
        members.put(email, member);
    }

    // 회원 전체 목록 List로 가져오기
    public List<Member> getList() {

        // values()는 반환값이 List가 아니라 Collection임을 유의
        // 그래서 ArrayList로 가져와야함!
        return new ArrayList<>(members.values());
    }
}