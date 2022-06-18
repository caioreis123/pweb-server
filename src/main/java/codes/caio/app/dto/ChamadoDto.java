package codes.caio.app.dto;

import codes.caio.app.models.Chamado;
import codes.caio.app.models.Client;
import codes.caio.app.models.enums.Assunto;
import codes.caio.app.models.enums.Status;
import codes.caio.app.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

public class ChamadoDto {
    private Status status;
    private Assunto assunto;
    private String complemento;
    private String dataDeCadastro;
    private String cnpjDoCliente;

    public Chamado toChamado(Client client) {
        return new Chamado(status, assunto, complemento, dataDeCadastro, client);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getCnpjDoCliente() {
        return cnpjDoCliente;
    }

    public void setCnpjDoCliente(String cnpjDoCliente) {
        this.cnpjDoCliente = cnpjDoCliente;
    }
}
