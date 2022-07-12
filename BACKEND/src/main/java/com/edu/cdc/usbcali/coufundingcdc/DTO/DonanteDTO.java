package com.edu.cdc.usbcali.coufundingcdc.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class DonanteDTO {

    private int idDonante;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombre;
    private String email;
    private String numeroTelefono;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String colCreador;
    private String colModificador;

}
