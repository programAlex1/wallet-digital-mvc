package com.talleresspringbootmvc.transferservice.dto;

import java.time.LocalDate;

public record TransferRequestDto (
        Long originClientId,
        Long destinationClientId,
        LocalDate date
){
}
