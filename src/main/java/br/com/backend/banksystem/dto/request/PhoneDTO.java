package br.com.backend.banksystem.dto.request;

import br.com.backend.banksystem.enums.PhoneType;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneDTO {

    private Long id;

    @Length(min = 2, max = 2, message = "DDD deve ter 2 digitos")
    private int ddd;

    @Length(min = 2, max = 2, message = "Numero deve ter entre 8 a 9 digitos")
    private String number;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

}
