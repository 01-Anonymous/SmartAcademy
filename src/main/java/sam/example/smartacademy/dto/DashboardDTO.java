package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardDTO {
    private Long id ;
    private Integer staffa;
    private Integer active_students;
    private Integer groups;
    private Integer actively_lift_students;

}
