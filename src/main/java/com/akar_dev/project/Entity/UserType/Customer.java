package com.akar_dev.project.Entity.UserType;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(
        name = "customer"
//        uniqueConstraints = @UniqueConstraint(
//                columnNames = "customerEmail",
//                name = "unique_customer_email"
//        )

)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "customer_sequence")
    private Long customerID;
    private String customerName;
    private String customerEmail;
    private String customerPassword;
}
