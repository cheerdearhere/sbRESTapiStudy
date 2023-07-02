package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//database 관련 bean임을 표시
public interface UserRepository extends JpaRepository<User, Integer> {
    //JpaRepository에서 관련 사항 정의
}
