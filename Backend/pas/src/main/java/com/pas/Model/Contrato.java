package com.pas.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contrato")
@Data
public class Contrato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Integer id;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUser;

    @Column(name = "fecha_inicio")
    private Date starts;

    @Column(name = "fecha_final")
    private Date ends;

    @Column(name = "pago_dia", nullable = false)
    private Double earnDay;

    @Column(name = "activo")
    private Boolean active;
}
