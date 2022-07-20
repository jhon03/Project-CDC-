package com.edu.cdc.usbcali.coufundingcdc.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "programa")
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrograma;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombrePrograma;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo")
    private String tipoPrograma;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador")
    private String colCreador;

    @Column(name = "usu_modificador")
    private String colModificador;

    @Column(name = "estado")
    private String estado;




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_col")
    private Colaborador colaborador;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "programa")
    private List<Proyecto> proyectos = new ArrayList<>();



}
