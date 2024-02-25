package com.mohamed.demojpa1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id ;

    @Column(name = "first_name")
    private String firstName ;
    @Column(name = "last_name")
    private String last_Name ;
    @Column(name = "email")
    private String email ;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
