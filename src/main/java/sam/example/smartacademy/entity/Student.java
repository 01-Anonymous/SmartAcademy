package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.enums.Gender;
import sam.example.smartacademy.entity.enums.Status;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class Student extends AbsLongEntity {

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
