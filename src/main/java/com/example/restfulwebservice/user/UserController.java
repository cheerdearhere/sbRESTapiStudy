package com.example.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
public class UserController {
    //IoC,DI로 bean생성
//constructor를 사용
    private UserService service;
    public UserController(UserService service){
//해당 class에서 어노테이션으로 역할(service/component)을 지정하지 않으면 사용할 수 없음(에러)
        this.service = service;
    }


    //service에 따른 controller 작성
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    //GET /users/1 or GET /users/10 -> 1, 10은 따로 지정하지 않으면 String으로 온다.
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }
}
