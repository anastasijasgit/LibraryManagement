package com.example.LibraryManagementAPI.repository;

import com.example.LibraryManagementAPI.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
