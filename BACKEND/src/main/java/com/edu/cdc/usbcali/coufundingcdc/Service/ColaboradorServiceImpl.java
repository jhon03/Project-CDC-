package com.edu.cdc.usbcali.coufundingcdc.Service;


import com.edu.cdc.usbcali.coufundingcdc.DTO.ColaboradorDTO;
import com.edu.cdc.usbcali.coufundingcdc.Domain.Colaborador;
import com.edu.cdc.usbcali.coufundingcdc.Repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Scope("singleton")
@Service
public class ColaboradorServiceImpl  implements ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;


    @Override
    public Colaborador crearColaborador(ColaboradorDTO colaboradorDTO) throws Exception {

        Colaborador colaborador = new Colaborador();

        colaborador.setIdCol(colaboradorDTO.getIdCol());
        colaborador.setNumeroIdentificacion(colaboradorDTO.getNumeroIdentificacion());
        colaborador.setTipoIdentificacion(colaboradorDTO.getTipoIdentificacion());
        colaborador.setNombre(colaboradorDTO.getNombre());
        colaborador.setUsuario(colaboradorDTO.getUsuario());
        colaborador.setContraseña(colaboradorDTO.getContraseña());
        colaborador.setFechaCreacion(colaboradorDTO.getFechaCreacion());
        colaborador.setFechaModificacion(colaboradorDTO.getFechaModificacion());
        colaborador.setColCreador(colaboradorDTO.getColCreador());
        colaborador.setColModificacador(colaboradorDTO.getColModificacador());
        colaborador.setEstado(colaboradorDTO.getEstado());

        colaboradorRepository.save(colaborador);
        return colaborador;
    }


    @Override
    public Colaborador findBynumeroIdentificacion(String numeroIdentificacion) throws Exception {
        Colaborador colaborador = new Colaborador();
       colaborador =  colaboradorRepository.findBynumeroIdentificacion(numeroIdentificacion);

        return colaborador ;
    }

    @Override
    public Colaborador findById(int idCol) throws Exception {
        if (!colaboradorRepository.findById(idCol).isPresent()) {
            throw new Exception(("el colaborador con id: " + idCol + "no existe en la base de datos"));
        }
            return colaboradorRepository.findById(idCol).get();
        }

    @Override
    public Colaborador actualizarColaborador(ColaboradorDTO colaboradorDTO) throws Exception {

        Colaborador colaborador = null;

        colaborador = findById(colaboradorDTO.getIdCol());

        colaborador.setNumeroIdentificacion(colaboradorDTO.getNumeroIdentificacion());
        colaborador.setTipoIdentificacion(colaboradorDTO.getTipoIdentificacion());
        colaborador.setNombre(colaboradorDTO.getNombre());
        colaborador.setUsuario(colaboradorDTO.getUsuario());
        colaborador.setContraseña(colaboradorDTO.getContraseña());
        colaborador.setFechaCreacion(colaboradorDTO.getFechaCreacion());
        colaborador.setFechaModificacion(colaboradorDTO.getFechaModificacion());
        colaborador.setColCreador(colaboradorDTO.getColCreador());
        colaborador.setColModificacador(colaboradorDTO.getColModificacador());
        colaborador.setEstado(colaboradorDTO.getEstado());

        colaboradorRepository.save(colaborador);
        return colaborador;
    }

    @Override
    public void eliminarColaborador(Integer idCol) throws Exception {

        colaboradorRepository.deleteById(idCol);

    }

    @Override
    public List<Colaborador> findByNumeroIdentificacionLike(String numeroIdentificacion) throws Exception {

        List<Colaborador> lstColaboradores = null;
        lstColaboradores = colaboradorRepository.findByNumeroIdentificacionLike(numeroIdentificacion);

        if (lstColaboradores.isEmpty()){
            throw new Exception("No se encontraron colaboradores con el numero de indentificacion");
        }

        return lstColaboradores;
    }

    @Override
    public List<Colaborador> findAll() {

        return (List<Colaborador>) colaboradorRepository.findAll();
    }


}

