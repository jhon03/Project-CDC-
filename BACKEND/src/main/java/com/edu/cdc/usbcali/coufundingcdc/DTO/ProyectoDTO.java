package com.edu.cdc.usbcali.coufundingcdc.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ProyectoDTO {


    private int idProyecto;
    private String codigo;
    private String nombreProyecto;
    private String procedencia;
    private float costoProyecto;
    private  boolean casoExito;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String colCreador;
    private String colModificador;
    private String estado;


    private int idPrograma;

}
