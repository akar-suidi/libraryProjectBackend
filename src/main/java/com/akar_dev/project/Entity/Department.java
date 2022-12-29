package com.akar_dev.project.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(
        name = "department"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Department {
    @Id
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "department_sequence"
    )
    private Long departmentID;
    private String departmentName;

}
