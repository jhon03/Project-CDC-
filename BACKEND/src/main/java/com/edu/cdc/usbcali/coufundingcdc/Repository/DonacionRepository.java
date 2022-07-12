package com.edu.cdc.usbcali.coufundingcdc.Repository;

import com.edu.cdc.usbcali.coufundingcdc.Domain.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonacionRepository extends JpaRepository<Donacion, Integer> {
}
