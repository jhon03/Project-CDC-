package com.edu.cdc.usbcali.coufundingcdc.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "donante")
public class Donante {

    @Id
    @Column(name = "id_donante")
    private int idDonante;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String numeroTelefono;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "col_creador")
    private String colCreador;

    @Column(name = "col_modificador")
    private String colModificador;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "donante")
    private List<Donacion> donaciones = new ArrayList<>();

}
