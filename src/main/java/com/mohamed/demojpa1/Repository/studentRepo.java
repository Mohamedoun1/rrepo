package com.mohamed.demojpa1.Repository;

import com.mohamed.demojpa1.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepo extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.firstName like '3%' or s.firstName like 'h%'")
    public List<Student> getallH();

    @Transactional
    @Modifying
    @Query("update Student s set s.last_Name=:s")
    public void changeAllLastNames(String s);

    @Transactional
    @Modifying
    @Query("delete from Student s where s.id=:id")
    public void deleteStudentById(Integer id);
}
