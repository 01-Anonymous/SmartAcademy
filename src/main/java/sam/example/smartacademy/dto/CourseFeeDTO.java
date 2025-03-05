package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseFeeDTO {
    private Long id ;

    private String courseName;
    private Integer course_fee;
    private LocalDate openeDate;

}
