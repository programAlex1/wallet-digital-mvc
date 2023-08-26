package com.talleresspringbootmvc.walletservice.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wallets")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
public class WalletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double balance;
    private Long client_id; //Foraneo
}
