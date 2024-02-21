package classeobjetos.aula04;

public class ProdutoNacional {
    private String descricao;
    private double valor;
    private double imposto = 10;
    private double taxa = 5;

    public ProdutoNacional() {
    }

    public ProdutoNacional(double valor) {
        this.valor = valor;
    }

    public ProdutoNacional(String descricao, double valor) {
        this(valor);
        this.descricao = descricao;
    }

    public void exibirRelatorio() {
        double valorFinal = valor + ((valor * imposto) + (valor * taxa)) / 100;
        System.out.println("Descricao: " + descricao +
                "\nValor: R$" + valor +
                "\nImposto: " + imposto +
                "\nTaxa: " + taxa +
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

    public double getTaxa() {
        return taxa;
    }

}
