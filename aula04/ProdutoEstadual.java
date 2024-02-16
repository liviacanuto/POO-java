package aula04;

public class ProdutoEstadual {
    private String descricao;
    private double valor;
    private double imposto = 10;

    public ProdutoEstadual() {
    }

    public ProdutoEstadual(double valor) {
        this.valor = valor;
    }

    public ProdutoEstadual(String descricao, double valor) {
        this(valor);
        this.descricao = descricao;
    }

    public void exibirRelatorio() {
        double valorFinal = valor + (valor * imposto) / 100;
        System.out.println("Descricao: " + descricao +
                "\nValor: R$" + valor +
                "\nImposto: " + imposto + "%" +
                "\nValor Final: R$" + valorFinal);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }
}
