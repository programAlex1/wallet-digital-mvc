package com.talleresspringbootmvc.transferservice.model.mapper;

import com.talleresspringbootmvc.transferservice.dto.TransferRequestDto;
import com.talleresspringbootmvc.transferservice.dto.TransferResponseDto;
import com.talleresspringbootmvc.transferservice.model.TransferEntity;

public interface TransferMapper {

    TransferEntity toEntity(TransferRequestDto transferRequestDto);

    TransferResponseDto toDto(TransferEntity transferEntity);
}
