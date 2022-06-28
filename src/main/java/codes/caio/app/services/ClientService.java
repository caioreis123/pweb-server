package codes.caio.app.services;

import codes.caio.app.dto.ClientDto;
import codes.caio.app.models.Client;
import codes.caio.app.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ChamadoService chamadoService;

    public ResponseEntity<HttpStatus> createClient(ClientDto client) {
        clientRepository.save(client.toClient());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public List<ClientDto> listClients() {
        return ClientDto.toDtoList(clientRepository.findAll());
    }

    public Client getClient(String cnpj) {
        return clientRepository.findByCnpj(cnpj);
    }

    public ResponseEntity<HttpStatus> deleteClientAndItsChamados(String cnpj) {
        Client client = clientRepository.findByCnpj(cnpj);
        chamadoService.deleteChamadosByClient(client);
        clientRepository.deleteByCnpj(cnpj);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> updateClient(ClientDto client) {
        String cnpj = client.getCnpj();
        String nameFromClientRequest = client.getName();
        String addressFromClientRequest = client.getAddress();

        Client clientToUpdate = clientRepository.findByCnpj(cnpj);

        clientToUpdate.setName(nameFromClientRequest);
        clientToUpdate.setAddress(addressFromClientRequest);

        clientRepository.save(clientToUpdate);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
