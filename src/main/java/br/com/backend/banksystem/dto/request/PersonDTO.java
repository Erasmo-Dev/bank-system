package br.com.backend.banksystem.dto.request;

import br.com.backend.banksystem.model.Account;
import br.com.backend.banksystem.model.Address;
import br.com.backend.banksystem.model.Phone;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    private Long id;

    @Length(min=5, max=50, message = "Nome deve ter de 5 a 50 caracteres")
    private String name;

    @Length(min=5, max=50, message = "Sobrenome deve ter de 5 a 50 caracteres")
    private String surname;

    @Email(message = "Email deve ter um email valido")
    private String email;

    @Length(min=5, message = "Senha deve ter no minimo 5 caracteres")
    private String password;

    @NotEmpty(message = "CPF não pode ser vazio")
    @CPF(message = "CPF deve contar um cpf valido")
    private String cpf;

    @NotNull(message = "Data de nascimento não pode ser vazio")
    private LocalDate birthDate;

    @NotNull(message = "Contas não pode ser vazio")
    private List<Account> accounts;

    @NotNull(message = "Telefones não pode ser vazio")
    private List<Phone> phones;

    @NotNull(message = "Endereço não pode ser vazio")
    private Address address;
}
