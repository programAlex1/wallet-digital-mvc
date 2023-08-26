package com.talleresspringbootmvc.clientservice.model.mapper;

import com.talleresspringbootmvc.clientservice.dto.ClientRequestDto;
import com.talleresspringbootmvc.clientservice.dto.ClientResponseDto;
import com.talleresspringbootmvc.clientservice.model.ClientEntity;

public interface ClientMapper {

    ClientEntity toEntity(ClientRequestDto clientRequestDto);
    ClientResponseDto toDto(ClientEntity clientEntity);
}
