package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class Room extends AbsLongEntity {

    @Column(unique = true)
    private String roomName;

    private Integer capacity;

    private Integer countOfTable;

    private Integer countOfChair;
}
