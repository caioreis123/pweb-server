package codes.caio.app.repositories;

import codes.caio.app.models.Chamado;
import codes.caio.app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
    List<Chamado> findByClient(Client client);
}
