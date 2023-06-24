package com.pas.Model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios")
    private Integer id;

    @Column(name = "id_sede", nullable = false)
    private Integer idSede;

    @Column(name = "identificacion", length = 20, nullable = false)
    private String dni;

    @Column(name = "nombre", length = 100, nullable = false)
    private String name;

    @Column(name = "apellido", length = 100, nullable = false)
    private String surname;

    @Column(name = "direccion", nullable = false)
    private String address;

    @Column(name = "telefono", nullable = false, length = 20)
    private String phone;

    @Column(name = "huella", nullable = true)
    private Blob fingerprint;

    @Column(name = "rol", nullable = false)
    private String role;

    @Column(name = "activo")
    private Boolean active;
}
