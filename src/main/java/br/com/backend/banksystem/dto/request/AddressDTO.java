package br.com.backend.banksystem.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {

    private Long id;

    @Length(min = 1, max = 100, message = "Rua so pode ter no maximo 100 caracteres")
    private String street;

    @Length(min = 1, max = 100, message = "Bairro so pode ter no maximo 100 caracteres")
    private String Neighborhood;

    @Length(min = 2, max = 2, message = "Numero deve ter entre 2 a 8 caracteres")
    private String number;

    @Length(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    private String state;

}
