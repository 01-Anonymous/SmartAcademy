package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.example.smartacademy.entity.enums.Days;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupDTO {

    private Long id ;
    private String groupName;
    private String courseName;
    private Long teacherId;
    private Long roomId;
    private List<Days> days;
    private String startTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer groupPrice;

}
