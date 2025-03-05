package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDto {
    private Long id ;
    private String roomName;
    private Integer capacity;
    private Integer countOfTable;
    private Integer countOfChair;
}
