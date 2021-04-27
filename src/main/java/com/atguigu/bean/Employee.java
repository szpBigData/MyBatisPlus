package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunzhipeng
 * @create 2021-04-26 22:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;
}
