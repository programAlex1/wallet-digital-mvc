package com.talleresspringbootmvc.clientservice.dto;

import lombok.Builder;

@Builder
public record ClientResponseDto(
        Long clientId,
        Integer documentNumber,
        String phoneNumber,
        String email
) {
}
