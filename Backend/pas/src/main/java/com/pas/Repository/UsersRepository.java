package com.pas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pas.Model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    
}
