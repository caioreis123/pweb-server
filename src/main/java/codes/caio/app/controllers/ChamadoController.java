package codes.caio.app.controllers;

import codes.caio.app.dto.ChamadoDto;
import codes.caio.app.models.Chamado;
import codes.caio.app.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamado")
@CrossOrigin(origins = "*")
public class ChamadoController {
    @Autowired
    ChamadoService chamadoService;

    @PostMapping
    public ResponseEntity<Chamado> createChamado(@RequestBody Chamado chamado) {
        return chamadoService.createChamado(chamado);
    }

    @GetMapping
    public List<Chamado> listChamados() {
        return chamadoService.listChamados();
    }

    @PatchMapping
    public ResponseEntity<Chamado> updateChamado(@RequestBody Chamado chamado) {
        return chamadoService.updateChamado(chamado);
    }
}
