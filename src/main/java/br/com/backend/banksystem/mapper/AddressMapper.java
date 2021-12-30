package br.com.backend.banksystem.mapper;

import br.com.backend.banksystem.model.Address;
import br.com.backend.banksystem.dto.request.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toModel(AddressDTO addressDTO);

    AddressDTO toDTO(Address address);
}
