package com.talleresspringbootmvc.walletservice.dto;

public record WallletRequestDto (
         Double balance,
         Long client_id
){
}
