package com.srinu.repository;

import org.springframework.stereotype.Repository;
import com.srinu.entity.Student;

@Repository
public class StudentRepository extends JpaRepository <Student,Long>{

}
