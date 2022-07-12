package com.edu.cdc.usbcali.coufundingcdc.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "donacion")
public class Donacion {

    @Id
    @Column(name = "id_donacion")
    private int idDonacion;

    @Column(name = "name_projecto_donar")
    private String nombreProyecto;

    @Column(name = "valor_a_donar")
    private float valorDonacion;

    @Column(name = "nombre_donante")
    private String nombreDonante;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proyecto")
    private Proyecto proyecto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_donante")
    private Donante donante;

}
