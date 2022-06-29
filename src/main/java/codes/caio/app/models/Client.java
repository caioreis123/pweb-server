package codes.caio.app.models;

import codes.caio.app.dto.ClientDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "clients")
public class Client {
    @Id
    private String cnpj;

    private String name;
    private String address;
    private String timeOfRegistration;

    public Client(ClientDto client) {
        this.cnpj = client.getCnpj();
        this.name = client.getName();
        this.address = client.getAddress();
        this.timeOfRegistration = client.getTimeOfRegistration();
    }

    public Client() {

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
}
