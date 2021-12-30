package br.com.backend.banksystem.model;

import br.com.backend.banksystem.enums.PhoneType;
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
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2)
    private int ddd;

    @Column(nullable = false, length = 9)
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType phoneType;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Person person;

}
