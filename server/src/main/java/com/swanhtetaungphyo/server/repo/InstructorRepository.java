package com.swanhtetaungphyo.server.repo;

import com.swanhtetaungphyo.server.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}