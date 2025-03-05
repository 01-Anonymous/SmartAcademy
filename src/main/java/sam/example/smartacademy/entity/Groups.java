package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.enums.Days;
import sam.example.smartacademy.entity.enums.Status;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class Groups extends AbsLongEntity {


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


