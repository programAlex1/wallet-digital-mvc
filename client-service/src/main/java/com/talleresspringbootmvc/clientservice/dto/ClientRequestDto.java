package com.talleresspringbootmvc.clientservice.dto;

import lombok.Builder;

@Builder
public record ClientRequestDto(
        Integer documentNumber,
        String phoneNumber,
        String email
) {

}
