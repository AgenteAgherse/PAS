package com.pas.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sede")
@Data
public class Sede {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private Integer id;
    
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "direccion", nullable = false)
    private String address;

    @Column(name = "ciudad")
    private String city;
}
