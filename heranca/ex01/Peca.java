package heranca.ex01;

public class Peca {
    private String nome;
    private double custo;
    private double lucro;

    public Peca() {
        this.nome = "sem nome";
    }

    public Peca(String nome, double custo, double lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public double calcularPreco() {
        return this.custo + this.lucro;
    }

    public String toString() {
        return ("Nome: " + this.nome +
                "\nCusto: " + this.custo +
                "\nLucro: " + this.lucro);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

}
