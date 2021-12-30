package br.com.backend.banksystem.mapper;

import br.com.backend.banksystem.dto.request.PhoneDTO;
import br.com.backend.banksystem.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    Phone toModel(PhoneDTO phoneDTO);

    PhoneDTO toDTO(Phone phone);

}
