package com.talleresspringbootmvc.transferservice.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record TransferResponseDto (
        Long id,
        Long originClientId,
        Long destinationClientId,
        LocalDate date
){
}
