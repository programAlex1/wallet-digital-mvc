package com.talleresspringbootmvc.walletservice.service;


import com.talleresspringbootmvc.walletservice.dto.WalletResponseDto;
import com.talleresspringbootmvc.walletservice.dto.WallletRequestDto;

public interface WalletService {

    WalletResponseDto createWallet(WallletRequestDto wallletRequestDto);

}
