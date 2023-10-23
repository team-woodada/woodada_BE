package com.me.wodada.member.repository;

import com.me.wodada.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByEmailAndProvider(String email, String provider);
}
