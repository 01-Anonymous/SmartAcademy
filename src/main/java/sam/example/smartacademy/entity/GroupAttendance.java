package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class GroupAttendance extends AbsLongEntity {

    private LocalDate date;

    private Boolean attendance;

    @ManyToOne
    private Groups group;

}
