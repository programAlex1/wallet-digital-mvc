package com.talleresspringbootmvc.clientservice.controller;

import com.talleresspringbootmvc.clientservice.dto.ClientRequestDto;
import com.talleresspringbootmvc.clientservice.dto.ClientResponseDto;
import com.talleresspringbootmvc.clientservice.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.talleresspringbootmvc.clientservice.constants.ClientConstants.BASE_URI;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = BASE_URI)
public class ClientController {

    private final ClientService clientService;

//    @GetMapping(value = "/{clientId}")
//    public ResponseEntity<ClientResponseDto> getClientById(@PathVariable String clientId){
//        ClientResponseDto clientResponseDto = new ClientResponseDto();
//        return ResponseEntity.ok(clientResponseDto);
//    }

    @PostMapping()
    public ResponseEntity<ClientResponseDto> createClient(@RequestBody ClientRequestDto clientRequestDto){
        ClientResponseDto responseDto =clientService.createClient(clientRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(responseDto);
    }

//    @PutMapping(value = "/{clientId}")
//    public ResponseEntity<ClientResponseDto> updateClientById(@PathVariable String clientId, @RequestBody ClientRequestDto clientRequestDto){
//        ClientResponseDto clientResponseDto = new ClientResponseDto();
//        return ResponseEntity.status(HttpStatus.CREATED).body(clientResponseDto);
//    }



//    @DeleteMapping(value = "/{clientId}")
//    public ResponseEntity<Boolean> delete(@PathVariable String clientId){
//
//        return ResponseEntity.ok(true);
//    }
}
