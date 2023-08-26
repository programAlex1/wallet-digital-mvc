package com.talleresspringbootmvc.walletservice.model.mapper;

import com.talleresspringbootmvc.walletservice.dto.WalletResponseDto;
import com.talleresspringbootmvc.walletservice.dto.WallletRequestDto;
import com.talleresspringbootmvc.walletservice.model.WalletEntity;

public interface WalletMapper {

    WalletEntity toEntity(WallletRequestDto dto);

    WalletResponseDto toDto(WalletEntity walletEntity);
}
