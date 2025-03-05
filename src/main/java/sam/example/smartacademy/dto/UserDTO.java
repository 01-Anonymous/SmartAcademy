package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.example.smartacademy.entity.enums.Gender;
import sam.example.smartacademy.entity.enums.Role;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDTO {

    private Long id ;
    private String firstname;
    private String lastname;
    private String password;
    private String phoneNumber;
    private Gender gender;
    private Role role;


}
