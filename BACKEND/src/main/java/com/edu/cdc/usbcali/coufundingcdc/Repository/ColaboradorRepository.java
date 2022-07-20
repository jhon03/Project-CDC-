package com.edu.cdc.usbcali.coufundingcdc.Repository;

import com.edu.cdc.usbcali.coufundingcdc.Domain.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {

    public Colaborador findBynumeroIdentificacion(String numeroIdentificacion) throws Exception;

    public List<Colaborador> findByNumeroIdentificacionLike(String numeroIdentificacion) throws Exception;
}
