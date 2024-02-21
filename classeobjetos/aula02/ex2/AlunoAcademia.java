package classeobjetos.aula02.ex2;

public class AlunoAcademia {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isMaior18() {
        if (idade >= 18)
            return true;
        return false;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
