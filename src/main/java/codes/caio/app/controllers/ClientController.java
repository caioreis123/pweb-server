package codes.caio.app.controllers;

import codes.caio.app.dto.ClientDto;
import codes.caio.app.models.Client;
import codes.caio.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto client) {
        return clientService.createClient(client);
    }

    @GetMapping
    @ResponseBody
    public List<Client> listClients() {
        return clientService.listClients();
    }

    @DeleteMapping("/{cnpj}")
    @Transactional
    public ResponseEntity<Client> deleteClient(@PathVariable String cnpj) {
        return clientService.deleteClientAndItsChamados(cnpj);
    }

    @PatchMapping
    public ResponseEntity<ClientDto> updateClient(@RequestBody ClientDto client) {
        return clientService.updateClient(client);
    }
}
