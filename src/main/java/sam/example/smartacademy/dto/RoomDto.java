package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private String roomName;
    private Integer capacity;
    private Integer countOfTable;
    private Integer countOfChair;
}
