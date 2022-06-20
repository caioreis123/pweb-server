package codes.caio.app.services;

import codes.caio.app.models.Chamado;
import codes.caio.app.models.Client;
import codes.caio.app.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {
    @Autowired
    private ChamadoRepository chamadoRepository;

    public ResponseEntity<Chamado> createChamado(Chamado chamado) {
        chamadoRepository.save(chamado);
        return ResponseEntity.ok(chamado) ;
    }

    public List<Chamado> listChamados() {
        return chamadoRepository.findAll();
    }

    public void deleteChamadosByClient(Client client) {
        List<Chamado> chamados = chamadoRepository.findByClient(client);
        chamadoRepository.deleteAll(chamados);
    }

    public ResponseEntity<Chamado> updateChamado(Chamado chamado) {
        chamadoRepository.save(chamado);
        return ResponseEntity.ok(chamado);
    }
}
