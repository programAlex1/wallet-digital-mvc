package com.talleresspringbootmvc.clientservice.model.mapper;

import com.talleresspringbootmvc.clientservice.dto.ClientRequestDto;
import com.talleresspringbootmvc.clientservice.dto.ClientResponseDto;
import com.talleresspringbootmvc.clientservice.model.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImpl implements ClientMapper{
    @Override
    public ClientEntity toEntity(ClientRequestDto dto) {
        return ClientEntity.builder()
                .phoneNumber(dto.phoneNumber())
                .email(dto.email())
                .documentNumber(dto.documentNumber())
                .build();
    }
    @Override
    public ClientResponseDto toDto(ClientEntity entity) {
        return ClientResponseDto.builder()
                .clientId(entity.getId())
                .documentNumber(entity.getDocumentNumber())
                .email(entity.getEmail())
                .phoneNumber(entity.getPhoneNumber())
                .build();
    }
}
