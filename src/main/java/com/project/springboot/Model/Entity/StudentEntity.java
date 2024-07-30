package com.project.springboot.Model.Entity;

import jakarta.persistence.*;

@Table(name = "students", schema = "public")
@Entity
public class StudentEntity {

    @Id
    @Column(name = "stu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stu_name",nullable = false,length = 50,unique = true)
    private String name;

    public void setId(Long _id){
        this.id = _id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

}
