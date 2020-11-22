package com.sy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
@ToString
public class Book {
    private String id; //图书id
    private String name; //图书名字
    private String author;  //图书作者
}
