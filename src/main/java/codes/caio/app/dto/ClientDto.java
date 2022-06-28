package codes.caio.app.dto;

import codes.caio.app.models.Client;

import java.util.List;
import java.util.stream.Collectors;

public class ClientDto {
    private String cnpj;
    private String name;
    private String address;
    private String timeOfRegistration;

    public ClientDto(Client client) {
        this.cnpj = client.getCnpj();
        this.name = client.getName();
        this.address = client.getAddress();
        this.timeOfRegistration = client.getTimeOfRegistration();
    }

    public static List<ClientDto> toDtoList(List<Client> clients) {
        return clients.stream()
                .map(ClientDto::new)
                .collect(Collectors.toList());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimeOfRegistration() {
        return timeOfRegistration;
    }

    public void setTimeOfRegistration(String timeOfRegistration) {
        this.timeOfRegistration = timeOfRegistration;
    }

    public Client toClient() {
        return new Client(this.cnpj, this.name, this.address, this.timeOfRegistration);
    }
}
