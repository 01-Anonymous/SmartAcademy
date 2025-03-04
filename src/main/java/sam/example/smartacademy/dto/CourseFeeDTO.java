package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseFeeDTO {
    private String courseName;
    private Integer course_fee;
    private LocalDate openeDate;

}
