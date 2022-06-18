package codes.caio.app.repositories;

import codes.caio.app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, String> {
}
