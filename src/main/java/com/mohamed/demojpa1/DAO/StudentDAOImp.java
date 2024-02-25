package com.mohamed.demojpa1.DAO;

import com.mohamed.demojpa1.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImp implements studentDAO{

   private EntityManager entityManager ;

   @Autowired
   public StudentDAOImp(EntityManager entityManager){
       this.entityManager=entityManager;
   }
   @Transactional
    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public Student findStudentById(Integer id) {
        return entityManager.find(Student.class,id);
    }
    @Transactional
    @Override
    public int deleteByFirstName() {
        return entityManager.createQuery("delete from Student where firstName='ali'").executeUpdate();
    }





}
