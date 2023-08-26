package com.talleresspringbootmvc.transferservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "transfers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long originClientId; // Foranea
    private Long destinationClientId; //Foranea
    private LocalDate date;

}
