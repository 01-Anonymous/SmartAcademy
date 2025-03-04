package sam.example.smartacademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseMessage {

    private String message;
    private Object data;
    private Boolean status;
    
}
