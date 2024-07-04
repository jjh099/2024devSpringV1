package com.study.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	public Member insert(Member member) {
		Member returnMember = memberRepository.save(member);
		return returnMember;
	}
	
	// 데이터를 여러개 가져올때는 list 사용
	public List <Member> selectAll(){
//		Member memberAll = memberRepository.findAll();
//		return memberAll;
		return memberRepository.findAll();
	}
	
	// 데이터를 한줄만 가져올때는 optional 사용
	public Optional <Member> select(Long id){
		Optional<Member> member = memberRepository.findById(id);
		return member;
		
	}
	
	public void delete(Long id) {
		memberRepository.deleteById(id);
	}
	
	public Member update(Member member) {
		Member returnMember = memberRepository.save(member);
		return returnMember;
	}
}
