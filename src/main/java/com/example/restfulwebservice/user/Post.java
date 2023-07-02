package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @GeneratedValue
    private int id;
    private String description;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)//User:Post > 1 : (0~N), Main: Sub -> Parent : Child
    private User user;
}
