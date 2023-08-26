package com.talleresspringbootmvc.walletservice.service;

import com.talleresspringbootmvc.walletservice.dto.WalletResponseDto;
import com.talleresspringbootmvc.walletservice.dto.WallletRequestDto;
import com.talleresspringbootmvc.walletservice.model.WalletEntity;
import com.talleresspringbootmvc.walletservice.model.mapper.WalletMapper;
import com.talleresspringbootmvc.walletservice.repository.WalletRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class WalletServiceImpl implements WalletService{

    private final WalletMapper walletMapper;

    private final WalletRepository walletRepository;

    @Override
    public WalletResponseDto createWallet(WallletRequestDto wallletRequestDto) {
        if(Objects.isNull(wallletRequestDto))
            throw new RuntimeException("La request no puede contener un objeto vacio");

        WalletEntity walletEntity= walletRepository.save(walletMapper.toEntity(wallletRequestDto));
        return walletMapper.toDto(walletEntity);
    }
}
