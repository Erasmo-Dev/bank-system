package br.com.backend.banksystem.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String street;

    @Column(nullable = false, length = 100)
    private String Neighborhood;

    @Column(nullable = false, length = 8)
    private String number;

    @Column(nullable = false, length = 2)
    private String state;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Person person;

}
