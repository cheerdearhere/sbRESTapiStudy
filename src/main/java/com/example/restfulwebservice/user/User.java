package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private Integer id;

    @Size(min=2)//최소 2글자
    private String name;
//    private String password;
//    private String ssn;
    @Past//과거 데이터만
    private Date joinDate;
}
