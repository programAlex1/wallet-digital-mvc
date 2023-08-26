package com.talleresspringbootmvc.clientservice.service;

import com.talleresspringbootmvc.clientservice.dto.ClientRequestDto;
import com.talleresspringbootmvc.clientservice.dto.ClientResponseDto;
import com.talleresspringbootmvc.clientservice.model.ClientEntity;
import com.talleresspringbootmvc.clientservice.model.mapper.ClientMapper;
import com.talleresspringbootmvc.clientservice.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService{

    private final ClientMapper clientMapper;
    private final ClientRepository clientRepository;

    @Override
    public ClientResponseDto createClient(ClientRequestDto dto) {
        if(dto == null)
            throw new RuntimeException("La request no puede contener un objeto vacio");

        ClientEntity entity = clientRepository.save(clientMapper.toEntity(dto));
        return clientMapper.toDto(entity);
    }
}
