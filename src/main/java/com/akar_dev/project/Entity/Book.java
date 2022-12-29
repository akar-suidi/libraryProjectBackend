package com.akar_dev.project.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(
        name = "book"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long bookID;
    private String bookName;
    private String bookPublisher;
    private Integer bookPrice;
    private Integer bookIdentificationNumber;
    private String bookLanguage;
    private boolean availability;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    @JoinColumn(
            name = "department_id",
            referencedColumnName = "departmentID"

    )
    private Department department;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "authors_id",
            referencedColumnName = "authID"
    )

    private Authors authors;


}
