package codes.caio.app.controllers;

import codes.caio.app.dto.ClientDto;
import codes.caio.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<HttpStatus> createClient(@RequestBody ClientDto client) {
        return clientService.createClient(client);
    }

    @GetMapping
    @ResponseBody
    public List<ClientDto> listClients() {
        return clientService.listClients();
    }

    @DeleteMapping("/{cnpj}")
    @Transactional
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable String cnpj) {
        return clientService.deleteClientAndItsChamados(cnpj);
    }

    @PatchMapping
    public ResponseEntity<HttpStatus> updateClient(@RequestBody ClientDto client) {
        return clientService.updateClient(client);
    }
}
