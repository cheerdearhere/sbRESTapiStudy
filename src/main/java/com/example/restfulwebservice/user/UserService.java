package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//business logic을 처리할 class
//DAO는 DB연결하기전에는 따로 만들지 않는다.
//@Component도 사용가능하나 더 구체적으로 지정
@Service
public class UserService {
    //data를 보관할 list(DB연결x)
    private static List<User> users = new ArrayList<>();
    //seq를 담당할 int
    private static int usersCnt = 0;

    //dummydata입력(constructor)
    static {
        users.add(new User(1,"kenneth","","", new Date()));
        users.add(new User(2,"Alice","","",new Date()));
        users.add(new User(3,"Elena","",""  ,new Date()));
        usersCnt = users.size();
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(usersCnt+1);
        }
        users.add(user);
        usersCnt = users.size();
        return user;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        //Iterator는 데이터(Collection)에 순차적으로 접근하는 열거형 데이터 타입
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
