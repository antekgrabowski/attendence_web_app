package com.swanhtetaungphyo.server.service;

import com.swanhtetaungphyo.server.dto.StudentDto;
import com.swanhtetaungphyo.server.model.Student;
import com.swanhtetaungphyo.server.repo.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public Student save(StudentDto studentDto) {
    Student student = Student.builder()
        .name(studentDto.getName())
        .email(studentDto.getEmail())
        .build();

    return studentRepository.save(student);
  }

  @Override
  public Optional<Student> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public List<Student> findAll() {
    return List.of();
  }

  @Override
  public Student update(Long id, StudentDto student) {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }
}
