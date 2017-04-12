package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tghe on 4/12/17.
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private int classNumber;

    public Student(String id, String name, int classNumber) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
