package classeabstrata.ex01;

public class Main01 {
    public static void main(String[] args) {
        Pessoa livia = new Pessoa("Livia");
        livia.addContato(new Email("livia@mail"));
        livia.addContato(new Telefone("1212-1212"));
        Agenda agenda = new Agenda("pessoa");
        agenda.addPessoa(livia);
        agenda.exibirContatosPessoa("livia");
        System.out.println("\n*****\n" + agenda.recuperarPessoaPorEmail("livia@mail"));
        System.out.println(agenda.recuperarPessoaPorTelefone("1212-1212"));

    }
}
