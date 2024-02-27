package classeabstrata.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Agenda {
    private String proprietario;
    private List<Pessoa> pessoas = new ArrayList<>();

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Agenda(String proprietario) {
        this.proprietario = proprietario;
    }

    public void addPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public Optional<Pessoa> buscarPessoa(String nome) {
        return pessoas.stream().filter(pessoa -> pessoa.getNome().equalsIgnoreCase(nome))
                .findAny();
    }

    public void addContato(String nome, Contato c) {
        buscarPessoa(nome).ifPresent(p -> p.addContato(c));
    }

    public void exibirTodasPessoas() {
        pessoas.stream().forEach(p -> System.out.println(p));
    }

    public void exibirContatosPessoa(String nome) {
        buscarPessoa(nome).ifPresent(p -> System.out.println(p));
    }

    public void exibirPessoasComEmail() {
        pessoas.stream().forEach(p -> {
            if (p.possuiEmail()) {
                System.out.println(p);
            }
        });
    }

    public void exibirPessoasComTelefone() {
        pessoas.stream().forEach(p -> {
            if (p.possuiTelefone()) {
                System.out.println(p);
            }
        });
    }

    public Optional<Pessoa> recuperarPessoaPorEmail(String email) {
        Predicate<Pessoa> temEsseEmail = p -> p.getEmails().stream().filter(e -> e.getEmail().equalsIgnoreCase(email))
                .findAny()
                .isPresent();
        return pessoas.stream().filter(temEsseEmail).findAny();
    }

    public Optional<Pessoa> recuperarPessoaPorTelefone(String telefone) {
        Predicate<Pessoa> temEsseTelefone = p -> p.getTelefones().stream()
                .filter(t -> t.getTelefone().equalsIgnoreCase(telefone))
                .findAny()
                .isPresent();
        return pessoas.stream().filter(temEsseTelefone).findAny();
    }
}
