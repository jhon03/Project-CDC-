package com.edu.cdc.usbcali.coufundingcdc.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ProgramaDTO {

    private int idPrograma;
    private String codigo;
    private String nombrePrograma;
    private String descripcion;
    private String tipoPrograma;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String colCreador;
    private String colModificador;
    private String estado;

    private int idColaborador;

}
