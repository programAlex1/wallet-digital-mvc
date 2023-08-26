package com.talleresspringbootmvc.walletservice.model.mapper;

import com.talleresspringbootmvc.walletservice.dto.WalletResponseDto;
import com.talleresspringbootmvc.walletservice.dto.WallletRequestDto;
import com.talleresspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.stereotype.Component;

@Component
public class WalletMapperImpl implements WalletMapper{
    @Override
    public WalletEntity toEntity(WallletRequestDto dto) {
        return WalletEntity.builder()
                .balance(dto.balance())
                .client_id(dto.client_id())
                .build();
    }

    @Override
    public WalletResponseDto toDto(WalletEntity walletEntity) {
        return WalletResponseDto.builder()
                .id(walletEntity.getId())
                .balance(walletEntity.getBalance())
                .client_id(walletEntity.getClient_id())
                .build();
    }
}
