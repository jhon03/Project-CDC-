package com.edu.cdc.usbcali.coufundingcdc.Mapper;

import com.edu.cdc.usbcali.coufundingcdc.DTO.ColaboradorDTO;
import com.edu.cdc.usbcali.coufundingcdc.Domain.Colaborador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColaboradorMapper {



    public List<ColaboradorDTO> listaColaboradoresToListColaboradoresDTO(List<Colaborador> colaboradorList);

    public List<ColaboradorDTO> listClienteToListClienteDTO(List<Colaborador> colaboradors);

}
