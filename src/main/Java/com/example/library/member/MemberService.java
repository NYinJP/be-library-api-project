package com.example.library.member;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService {
    public Member createMember(Member member){

        // TODO member 객체는 나중에 DB에 저장 후, 되돌려 받는 것으로 변경 필요.
        Member createdMember = member;
        return createdMember;

    }
    public Member updateMember(Member member){

        // member 객체는 나중에 DB에 업데이트 후, 되돌려 받는 것으로 변경 필요.
        Member updatedMember = member;
        return updatedMember;
    }
    public Member findMember(long memberId){
        Member member = new Member(memberId, "이난영","010-1234-5567","sksdud@naver.com");

        return member;
    }
    public List<Member> findMembers(){
        List<Member> members = List.of(
                new Member(1, "홍길동", "010-1234-5678","hhh@naver.com"),
                new Member(2, "이몽룡", "010-1111-2222","lml@gmail.com")
        );
        return members;
    }
    public void deleteMember(long memberId){

    }
}
