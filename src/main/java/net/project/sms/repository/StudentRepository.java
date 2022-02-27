package net.project.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.project.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}