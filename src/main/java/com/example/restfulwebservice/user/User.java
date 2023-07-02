package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//해당 class name으로 table을 생성하고 관리
public class User {
    //따로 생성하지 않아도 table을 생성해줌. 단, SQL로 직접 할경우 굳이 할필요없음
    @Id//primary key로 적용
    @GeneratedValue
    private Integer id;
    @Size(min=2)//최소 2글자
    private String name;
    private String password;
    private String ssn;
    @Past//과거 데이터만
    private Date joinDate;
    @OneToMany(mappedBy = "uesr")
    private List<Post> posts;
}
