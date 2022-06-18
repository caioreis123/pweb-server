package codes.caio.app.controllers;

import codes.caio.app.models.Client;
import codes.caio.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping
    @ResponseBody
    public List<Client> listClients() {
        return clientService.listClients();
    }

}
