// 회원 조회 담당

package org.koreait.member.services;

import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class MemberInfoService {

    // 조회를 위해 MemberRepository를 의존(필요)
    private MemberRepository repository;

    private DateTimeFormatter formmater = DateTimeFormatter.ofPattern("yy-MM-dd");


    /*
    @Autowired
    // setter로 연관 관계
    // 대입해주고 호출(set)하는 단계를 거침
    public void setRepository(/*@Qualifier("mRepo2")MemberRepository repository) //{
        // 의존성 주입
      this.repository = repository;
    }
    */

    @Autowired
    public void setRepository(Optional<MemberRepository> opt) {
        this.repository = opt.get();
    }

    // 설정 변경으로 Bean 필수 아니고 선택(false)으로 변경
    // @Autowired(required = false)
    @Autowired
    public void setFormmater(@Nullable DateTimeFormatter formatter) {
        this.formmater = formatter;
    }



    public void print() {

        List<Member> members = repository.getList();

        // 문자열로 변환
        members.forEach(m -> {
            if (formmater != null) {
                String regDtStr = formmater.format(m.getRegDt());
                m.setRegDtStr(regDtStr);
            }
            System.out.println(m);

        });
    }
}
