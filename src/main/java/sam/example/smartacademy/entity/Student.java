package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.enums.Gender;
import sam.example.smartacademy.entity.enums.Status;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fistName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    @Enumerated
    private Gender gender;

    @Enumerated
    private Status status = Status.ACTIVE;
    private Boolean addGroup = false;

}
