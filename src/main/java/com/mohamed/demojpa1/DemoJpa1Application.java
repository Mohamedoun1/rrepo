package com.mohamed.demojpa1;

import com.mohamed.demojpa1.DAO.StudentDAOImp;
import com.mohamed.demojpa1.Repository.studentRepo;
import com.mohamed.demojpa1.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class DemoJpa1Application {

    public static void main(String[] args) {

        SpringApplication.run(DemoJpa1Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(StudentDAOImp S) {
        return runner -> {
          // addStudent(S);
           // findStudentById(S);
            //updateLastName(S);
           // updateStudent(S);
            //deleteById(S);
            System.out.println(deleteByName(S));
        };
    }

    private int deleteByName(StudentDAOImp s) {
        return s.deleteByFirstName();
    }

    public void deleteById(studentRepo S){
        S.deleteById(1);
    }

    public void updateStudent(StudentDAOImp S){
        Student st =S.findStudentById(1);
        st.setEmail("@@@@@@@@@@@@");
        S.updateStudent(st);
    }
    private void updateLastName(studentRepo s) {

        s.changeAllLastNames("ammar");
    }

    private void findStudentById(studentRepo s) {

       List<Student> students=s.getallH();
        for(Student element : students){
            System.out.println(element.toString());
        }
    }

    private void addStudent(studentRepo s) {
        System.out.println("creation d un nouveau etudiant ");
        Student st2 = new Student(4,"ali","hmed","hamma@oun.com");
        Student st3 = new Student(5,"333","333","hamma@oun.com");

        System.out.println("ajout du student a la DB");
        s.save(st2);
        s.save(st3);
    }

}
