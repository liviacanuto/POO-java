package classeobjetos.aula02.ex5;

public class Funcionario {
    private int cod;
    private String nome;
    private String funcao;
    private double salario;

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario [cod=" + cod + ", nome=" + nome + ", funcao=" + funcao + ", salario=" + salario + "]";
    }

}
