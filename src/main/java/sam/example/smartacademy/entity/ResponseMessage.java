package sam.example.smartacademy.entity;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ResponseMessage  {

    private String message;
    private Object data;
    private Boolean status;
    
}
