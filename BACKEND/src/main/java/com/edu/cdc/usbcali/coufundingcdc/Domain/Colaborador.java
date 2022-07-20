package com.edu.cdc.usbcali.coufundingcdc.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCol;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "col_creador")
    private String colCreador;

    @Column(name = "col_modificador")
    private String colModificacador;

    @Column(name = "estado")
    private String estado;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "colaborador")
    private List<Programa> programas = new ArrayList<>();



}
