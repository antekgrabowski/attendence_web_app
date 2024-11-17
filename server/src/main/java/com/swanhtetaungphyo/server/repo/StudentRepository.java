package com.swanhtetaungphyo.server.repo;

import com.swanhtetaungphyo.server.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}