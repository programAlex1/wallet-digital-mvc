package com.talleresspringbootmvc.transferservice.repository;

import com.talleresspringbootmvc.transferservice.model.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferEntity,Long> {
}
