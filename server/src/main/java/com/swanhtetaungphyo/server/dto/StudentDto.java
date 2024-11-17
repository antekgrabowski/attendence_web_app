package com.swanhtetaungphyo.server.dto;

import com.swanhtetaungphyo.server.model.Attendance;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

/**
 * DTO for {@link com.swanhtetaungphyo.server.model.Student}
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentDto  {

  Long id;
  String name;
  String email;
  List<Attendance> attendanceRecords;
}