package com.example.boots.bean;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class Dog {

    private String name;
    private Integer age;

}
