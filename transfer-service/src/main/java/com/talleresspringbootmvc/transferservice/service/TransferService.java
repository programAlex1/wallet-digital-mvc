package com.talleresspringbootmvc.transferservice.service;

import com.talleresspringbootmvc.transferservice.dto.TransferRequestDto;
import com.talleresspringbootmvc.transferservice.dto.TransferResponseDto;

public interface TransferService {

    TransferResponseDto createTransfer(TransferRequestDto dto);
}
