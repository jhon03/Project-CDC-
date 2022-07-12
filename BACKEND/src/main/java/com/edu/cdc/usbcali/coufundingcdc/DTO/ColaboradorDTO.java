package com.edu.cdc.usbcali.coufundingcdc.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ColaboradorDTO {

    private int idCol;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombre;
    private String usuario;
    private String contraseña;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String colCreador;
    private String colModificacador;
    private String estado;

    public ColaboradorDTO() {
    }

}
