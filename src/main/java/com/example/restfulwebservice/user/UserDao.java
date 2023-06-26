package com.example.restfulwebservice.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    int totalRecord();
    List<User> findList();
    User findOne(int id);
    void save(User user);//Map
    void update(User user);
    void delete(int id);
}
