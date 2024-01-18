package hello.hello.spring.repository;

import java.util.List;
import java.util.Optional; // Fix typo here

import hello.hello.spring.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Fix typo here
    Optional<Member> findByName(String name); // Fix typo here
    List<Member> findAll();
}
