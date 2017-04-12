package com.example.demo.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

//@Entity
//@Table(name = "users")
@XmlRootElement
public class User implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    private String userName = "";

    private int age = 0;

    private int weight = 0;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String email;

    // The user name
    @NotNull
    private String name;

    public User() { }
    public User(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}