package com.edu.cdc.usbcali.coufundingcdc.DTO;

import lombok.Data;

@Data
public class DonacionDTO {

    private int    idDonacion;
    private String nombreProyecto;
    private float valorDonacion;
    private String nombreDonante;


    private int idProject;
    private int idDonante;

    public DonacionDTO() {
    }
}
