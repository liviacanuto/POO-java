package heranca.ex03;

public class Funcionario {
    protected int codigo;
    protected String nome;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Salario: " + salario + "\n";
    }

}
