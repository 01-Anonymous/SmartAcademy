package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDTO {
    private Integer staffa;
    private Integer active_students;
    private Integer groups;
    private Integer actively_lift_students;

}
