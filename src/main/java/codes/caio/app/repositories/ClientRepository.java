package codes.caio.app.repositories;

import codes.caio.app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, String> {
    Client findByCnpj(String cnpjDoCliente);

    void deleteByCnpj(String cnpj);

    void removeByCnpj(String cnpj);
}
