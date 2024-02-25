package heranca.ex03;

public class Docente extends Funcionario {
    private String titulacao;

    public Docente() {
        super();
    }

    public Docente(int codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() + "Titulação: " + titulacao + "\n";
    }
}
