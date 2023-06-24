package com.pas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pas.Model.Registro;

public interface RegisterRepository extends JpaRepository<Registro, Integer>{
    
}
