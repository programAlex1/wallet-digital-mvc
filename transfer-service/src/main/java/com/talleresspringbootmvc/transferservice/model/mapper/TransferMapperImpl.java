package com.talleresspringbootmvc.transferservice.model.mapper;

import com.talleresspringbootmvc.transferservice.dto.TransferRequestDto;
import com.talleresspringbootmvc.transferservice.dto.TransferResponseDto;
import com.talleresspringbootmvc.transferservice.model.TransferEntity;
import org.springframework.stereotype.Component;

@Component
public class TransferMapperImpl implements TransferMapper{
    @Override
    public TransferEntity toEntity(TransferRequestDto transferRequestDto) {
        return TransferEntity.builder()
                .date(transferRequestDto.date())
                .originClientId(transferRequestDto.originClientId())
                .destinationClientId(transferRequestDto.destinationClientId())
                .build();
    }

    @Override
    public TransferResponseDto toDto(TransferEntity transferEntity) {
        return TransferResponseDto.builder()
                .id(transferEntity.getId())
                .originClientId(transferEntity.getOriginClientId())
                .destinationClientId(transferEntity.getDestinationClientId())
                .date(transferEntity.getDate())
                .build();
    }
}
