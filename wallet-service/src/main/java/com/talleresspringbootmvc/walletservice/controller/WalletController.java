package com.talleresspringbootmvc.walletservice.controller;


import com.talleresspringbootmvc.walletservice.constants.Url;
import com.talleresspringbootmvc.walletservice.dto.WalletResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Url.API_URL)
public class WalletController {

//    @GetMapping("{walletId}")
//    public ResponseEntity<WalletResponseDto> getById(@PathVariable String walletId){
//        WalletResponseDto walletResponseDto = new WalletResponseDto();
//        return ResponseEntity.ok(walletResponseDto);
//    }
}
