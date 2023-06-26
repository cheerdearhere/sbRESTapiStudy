package com.example.restfulwebservice.helloWord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter,setter method
@AllArgsConstructor //parameter가 있는 constructor
@NoArgsConstructor //default constructor
public class HelloWorldBean {
    private String message;
}
