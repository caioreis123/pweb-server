package codes.caio.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "clients")
public class Client {
    @Id
    private String cnpj;

    private String name;
    private String address;
    private String timeOfRegistration;

    public Client(String cnpj, String name, String address, String timeOfRegistration) {
        this.cnpj = cnpj;
        this.name = name;
        this.address = address;
        this.timeOfRegistration = timeOfRegistration;
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
