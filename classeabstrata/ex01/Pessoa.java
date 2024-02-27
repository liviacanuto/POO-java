package classeabstrata.ex01;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<Contato> contatos = new ArrayList<>();
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void addContato(Contato c) {
        this.contatos.add(c);
    }

    public List<Contato> getContatos() {
        return this.contatos;
    }

    public List<? extends Contato> getContatos(String tipo) {
        if (tipo.equalsIgnoreCase("Email"))
            return getEmails();
        return getTelefones();
    }

    public List<Email> getEmails() {
        List<Email> emails = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato instanceof Email) {
                emails.add((Email) contato);
            }
        }
        return emails;
    }

    public List<Telefone> getTelefones() {
        List<Telefone> telefones = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato instanceof Telefone) {
                telefones.add((Telefone) contato);
            }
        }
        return telefones;
    }

    public boolean possuiEmail() {
        if (getContatos("Email").size() == 0) {
            return false;
        }
        return true;
    }

    public boolean possuiTelefone() {
        if (getContatos("Telefone").size() == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nContatos: [" + this.contatos.toString() + "]";
    }
}
