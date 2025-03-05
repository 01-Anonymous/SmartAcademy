package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.enums.Gender;
import sam.example.smartacademy.entity.enums.Role;
import sam.example.smartacademy.entity.enums.Status;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "users")
@Builder
public class User extends AbsLongEntity {

    private String firstName;

    private String lastname;

    private String email;

    private String password;

    private String phoneNumber;

    @Enumerated
    private Gender gender;
    @Enumerated
    private Status status = Status.ACTIVE;
    @Enumerated
    private Role role;
}
