package com.talleresspringbootmvc.clientservice.repository;

import com.talleresspringbootmvc.clientservice.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
}
