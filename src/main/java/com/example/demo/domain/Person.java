package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Person {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long  id;//部门名
    private String name;//部门名称
    private int  age;//部门名称
    private String address;//部门名称



    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(Long id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}
