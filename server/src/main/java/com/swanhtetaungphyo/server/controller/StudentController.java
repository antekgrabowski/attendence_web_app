package com.swanhtetaungphyo.server.controller;

import com.swanhtetaungphyo.server.dto.StudentDto;
import com.swanhtetaungphyo.server.model.Student;
import com.swanhtetaungphyo.server.service.StudentServiceImpl;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
  private final StudentServiceImpl studentService;

  public StudentController(StudentServiceImpl studentService) {
    this.studentService = studentService;
  }

  @PostMapping
  public ResponseEntity<?> handleCreate(@RequestBody StudentDto student){
    if(student == null){
      return ResponseEntity.badRequest().body("Student data must not be null");
    }
    Student createdStudent = studentService.save(student);
    return ResponseEntity.ok().body(createdStudent);
  }

  @GetMapping
  public ResponseEntity<?> handleGetAll(){
    List<Student> studentList = studentService.findAll();
    return  ResponseEntity.ok().body(studentList);
  }

  @PutMapping
  public ResponseEntity<?> handleUpdate(@RequestParam Long Id, @RequestBody StudentDto student){
    Student studentUpdated  = studentService.update(Id, student);
    return ResponseEntity.ok().body(studentUpdated);
  }
  @DeleteMapping
  public ResponseEntity<?> handleDelete(@RequestParam Long studentId){
    if(studentId == null){
      return ResponseEntity.badRequest().body("Student Id is null");
    }
    studentService.deleteById(studentId);
    String response = String.format("Student with ID : %s is deleted",studentId );
    return ResponseEntity.ok().body(response);
  }


}
