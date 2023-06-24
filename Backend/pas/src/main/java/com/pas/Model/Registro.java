package com.pas.Model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "registro")
@Data
public class Registro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregistro")
    private Integer id;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUser;

    @Column(name = "tipo_registro", nullable = true)
    private String registerType;

    @Column(name = "hora", nullable = true)
    private Time hour;

    @Column(name = "dia", nullable = true)
    private Date day;

    @Column(nullable = true)
    private Date deletedAt;
}
