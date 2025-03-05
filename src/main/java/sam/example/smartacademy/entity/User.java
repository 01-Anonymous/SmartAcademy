package sam.example.smartacademy.entity;

import jakarta.persistence.*;
import lombok.*;
import sam.example.smartacademy.entity.enums.Gender;
import sam.example.smartacademy.entity.enums.Role;
import sam.example.smartacademy.entity.enums.Status;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
