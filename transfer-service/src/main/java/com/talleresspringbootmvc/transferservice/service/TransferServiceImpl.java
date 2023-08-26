package com.talleresspringbootmvc.transferservice.service;

import com.talleresspringbootmvc.transferservice.dto.TransferRequestDto;
import com.talleresspringbootmvc.transferservice.dto.TransferResponseDto;
import com.talleresspringbootmvc.transferservice.model.TransferEntity;
import com.talleresspringbootmvc.transferservice.model.mapper.TransferMapper;
import com.talleresspringbootmvc.transferservice.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class TransferServiceImpl implements TransferService{

    private final TransferRepository transferRepository;
    private final TransferMapper transferMapper;
    @Override
    public TransferResponseDto createTransfer(TransferRequestDto dto) {
        if(Objects.isNull(dto))
            throw new RuntimeException("La request no puede contener un objeto vacio");

        TransferEntity transferEntity =transferRepository.save(transferMapper.toEntity(dto));
        return transferMapper.toDto(transferEntity);
    }
}
