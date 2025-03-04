package sam.example.smartacademy.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.example.smartacademy.entity.enums.Gender;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private Gender gender;
}
