package com.edu.cdc.usbcali.coufundingcdc.Controller;


import com.edu.cdc.usbcali.coufundingcdc.DTO.ColaboradorDTO;
import com.edu.cdc.usbcali.coufundingcdc.Domain.Colaborador;
import com.edu.cdc.usbcali.coufundingcdc.Service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/colaborador")
public class ColaboradorRestController {

    @Autowired
    private ColaboradorService colaboradorService;

    @PostMapping("/crear/colaborador")
    public ResponseEntity<?> crearColaborador(@RequestBody ColaboradorDTO colaboradorDTO){

        try {
            Colaborador colaborador = colaboradorService.crearColaborador(colaboradorDTO);
            return ResponseEntity.ok().body(colaborador);

        }catch (Exception e){
            return  ResponseEntity.ok(e.getMessage());
        }
    }

    @PutMapping("/actualizarColaborador")
    public ResponseEntity<?> actualizarColaborador(@RequestBody ColaboradorDTO colaboradorDTO){
        try {
            Colaborador colaborador = colaboradorService.actualizarColaborador(colaboradorDTO);
            return ResponseEntity.ok().body(colaborador);
        }catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }
    }

    @GetMapping("/idCol")
    public ResponseEntity<?> buscarColaborador(@RequestParam("idCol") int idCol){
        try {
            Colaborador colaborador = colaboradorService.findById(idCol);
            return  ResponseEntity.ok(colaborador);
        }catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }

    @DeleteMapping("eliminarColaborador/{id}")
    public ResponseEntity<?> eliminarColaborador(@PathVariable("id") int idCol){
        try {
            colaboradorService.eliminarColaborador(idCol);
            return ResponseEntity.ok("Se elimino el colaborador con éxito");
        }catch (Exception e){
            return ResponseEntity.ok(e.getMessage());

        }
    }

}
