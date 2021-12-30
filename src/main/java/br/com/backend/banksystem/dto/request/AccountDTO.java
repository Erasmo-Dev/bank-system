package br.com.backend.banksystem.dto.request;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDTO {

    private Long id;

    @NotNull(message = "Campo saldo não pode ser vazio")
    private BigDecimal balance;

    @Temporal(TemporalType.DATE)
    private Date creationDate;
}
