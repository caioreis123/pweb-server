package codes.caio.app.services;

import codes.caio.app.models.Client;
import codes.caio.app.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ResponseEntity<Client> createClient(Client client) {
        clientRepository.save(client);
        return ResponseEntity.ok(client);
    }

    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    public Client getClient(String cnpj) {
        return clientRepository.findByCnpj(cnpj);
    }
}
