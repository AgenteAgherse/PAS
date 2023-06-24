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
@Table(name = "recaudo")
@Data
public class Recaudo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrecaudo")
    private Integer id;

    @Column(name = "idusuario", nullable = false)
    private Integer idUser;

    private Integer total;

    @Column(name = "fecha")
    private Date date;

    
}
