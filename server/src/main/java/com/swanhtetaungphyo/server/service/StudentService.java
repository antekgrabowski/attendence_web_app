package com.swanhtetaungphyo.server.service;

import com.swanhtetaungphyo.server.dto.StudentDto;
import com.swanhtetaungphyo.server.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
  Student save(StudentDto student);


  Optional<Student> findById(Long id);


  List<Student> findAll();


  Student update(Long id, StudentDto studentDto);


  void deleteById(Long id);
}
