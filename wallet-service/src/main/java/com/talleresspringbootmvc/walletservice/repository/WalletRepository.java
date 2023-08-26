package com.talleresspringbootmvc.walletservice.repository;

import com.talleresspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletEntity,Long> {
}
