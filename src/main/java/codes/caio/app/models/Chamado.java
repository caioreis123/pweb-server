package codes.caio.app.models;

import codes.caio.app.models.enums.Assunto;
import codes.caio.app.models.enums.Status;

import javax.persistence.*;

@Entity(name = "chamados")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Client client;

    @Enumerated(EnumType.STRING)
    private Assunto assunto;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String complemento;

    private String dataDeCadastro;

    public Chamado(Status status, Assunto assunto, String complemento, String dataDeCadastro, Client client) {
        this.status = status;
        this.assunto = assunto;
        this.complemento = complemento;
        this.dataDeCadastro = dataDeCadastro;
        this.client = client;
    }

    public Chamado() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
}
