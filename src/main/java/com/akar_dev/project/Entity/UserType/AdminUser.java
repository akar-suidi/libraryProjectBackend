package com.akar_dev.project.Entity.UserType;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "admin_user"
//        uniqueConstraints = @UniqueConstraint(
//                columnNames = "admin_email",
//                name = "admin_unique_email"
//        )
)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class AdminUser {
    //entity validation;


    @Id
    @SequenceGenerator(
            name = "admin_sequence",
            sequenceName = "admin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "admin_sequence")
    private Long adminID;
    @Column(
            name = "admin_name"
    )

    private String adminName;
    @Column(
            name = "admin_username"
    )
    private String adminEmail;
    @Column(
            name = "admin_password"
    )
    private String adminPassword;
    @Column(
            name = "admin_role"
    )
    private String adminRole;

}
