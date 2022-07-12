package com.edu.cdc.usbcali.coufundingcdc.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "proyecto")
public class Proyecto {


    @Id
    @Column(name = "id_proyecto")
    private int idProyecto;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombreProyecto;

    @Column(name = "procedencia")
    private String procedencia;

    @Column(name = "costo")
    private float costoProyecto;

    @Column(name = "caso_exito")
    private  boolean casoExito;

    @Column(name = "descripcion")
    private String descripcion;

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
    @JoinColumn(name = "id_programa")
    private Programa programa;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "proyecto")
    private List<Donacion> donaciones = new ArrayList<>();

}
