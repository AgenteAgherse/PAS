package com.pas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pas.Model.Admins;

public interface AdminsRepository extends JpaRepository<Admins, Integer>{
    
}
