package com.pas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pas.Model.Contrato;

public interface ContractRepository extends JpaRepository<Contrato, Integer> {
    
}
