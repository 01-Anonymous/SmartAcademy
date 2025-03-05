package sam.example.smartacademy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import sam.example.smartacademy.entity.tempAbs.AbsLongEntity;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Finance extends AbsLongEntity {

    private String name;

    private LocalDate date;

    private String category;

    private String receiver;

    private Double amount;

}
