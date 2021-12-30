package br.com.backend.banksystem.mapper;

import br.com.backend.banksystem.model.Account;
import br.com.backend.banksystem.dto.request.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account toModel(AccountDTO accountDTO);

    AccountDTO toDTO(Account account);
}
