package br.com.backend.banksystem.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Person person;

    @Column(nullable = false)
    private BigDecimal balance;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date creationDate;

}
