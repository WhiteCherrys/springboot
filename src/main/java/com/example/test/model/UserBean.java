package com.example.test.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class UserBean {

    private int id;
    private String name;
    private String password;

}
