package com.talleresspringbootmvc.walletservice.dto;

import lombok.Builder;

@Builder
public record WalletResponseDto(
         Long id,
         Double balance,
         Long client_id
        ) {


}
