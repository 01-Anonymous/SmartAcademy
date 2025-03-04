package sam.example.smartacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FinanceDTO {

    private String name;
    private LocalDate date;
    private String category;
    private String receiver;
    private Double amount;

}
