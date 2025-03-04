package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.example.smartacademy.entity.enums.Days;
import sam.example.smartacademy.entity.enums.Status;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String groupName;
    private String courseName;

    @ManyToOne
    private User teacher;

    @ManyToOne
    private Room room;
    @ManyToMany
    private List<Student> students;
    private Integer stNumber = 0;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Days> days;
    private String startTime;
    private LocalDate startDate;
    private LocalDate endtDate;
    private Integer groupPrice = 0;
    private Status status = Status.ACTIVE;
    

}
