package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "attendance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    private LocalDate attendanceDate;
    private boolean attended;
    
}
