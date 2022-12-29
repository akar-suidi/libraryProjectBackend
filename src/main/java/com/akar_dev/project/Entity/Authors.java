package com.akar_dev.project.Entity;

import lombok.*;


import javax.persistence.*;

@Entity
@Table(
        name = "authors"
//        uniqueConstraints = @UniqueConstraint(
//                name = "unique_author_email", columnNames = "authEmail" )
)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Authors {

    @Id
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "author_sequence"
    )
    private Long authID;


    private String authFName;
    private String authLName;
    private String authEmail;
    private String authPassword;

//    @OneToMany(
//            cascade = CascadeType.ALL,
//            mappedBy = "authors",
//            orphanRemoval = true
//    )
//    private List<Book> book;


}
