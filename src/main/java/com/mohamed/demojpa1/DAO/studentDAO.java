package com.mohamed.demojpa1.DAO;

import com.mohamed.demojpa1.entity.Student;

public interface studentDAO {
    public void updateStudent(Student student);

    public Student findStudentById(Integer id);

    public int deleteByFirstName();
}
