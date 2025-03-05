package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Attendance extends AbsLongEntity {

    @ManyToOne
    private Student student;

    private LocalDate attendanceDate;
    private boolean attended;
    
}
