package com.talleresspringbootmvc.clientservice.service;

import com.talleresspringbootmvc.clientservice.dto.ClientRequestDto;
import com.talleresspringbootmvc.clientservice.dto.ClientResponseDto;

public interface ClientService {

    ClientResponseDto createClient(ClientRequestDto dto);


}
