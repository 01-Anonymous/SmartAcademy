package sam.example.smartacademy.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.example.smartacademy.entity.enums.Gender;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentDTO {
    private Long id ;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private Gender gender;
}
