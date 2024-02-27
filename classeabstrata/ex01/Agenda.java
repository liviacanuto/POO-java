package classeabstrata.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private String proprietario;
    private List<Pessoa> pessoas = new ArrayList<>();

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

    /**
     * REFAZER
     * essa busca esta não segura, para melhorar isso fazer crie um metodo getEmail
     * que retornem lista de email direto e nao uma lista de contato
     * assim nao será necessário fazer casting, o que facilitará no metodo
     * recuperarPessoaPorEmail
     */
    public Optional<Pessoa> recuperarPessoaPorEmail(String email) {
        return pessoas.stream()
                .filter(pessoa -> ((List<Email>) pessoa.getContatos("email"))
                        .stream()
                        .filter(c -> c.getEmail().equalsIgnoreCase(email))
                        .findAny()
                        .isPresent())
                .findAny();
    }

    /**
     * REFAZER
     * essa busca esta não segura, para melhorar isso fazer crie metodo getTelefone
     * que retornem lista de telefone direto e nao uma lista de contato
     * assim nao será necessário fazer casting, o que facilitará no metodo
     * recuperarPessoaPorTelefone
     */
    public Optional<Pessoa> recuperarPessoaPorTelefone(String telefone) {
        return pessoas.stream()
                .filter(pessoa -> ((List<Telefone>) pessoa.getContatos("telefone"))
                        .stream()
                        .filter(c -> c.getTelefone().equalsIgnoreCase(telefone))
                        .findAny()
                        .isPresent())
                .findAny();
    }
}
