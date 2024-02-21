package classeobjetos.aula04;

public class ProdutoImportado {
    private String descricao;
    private double valor;
    private double imposto = 10;
    private double taxa = 5;
    private double taxaImportacao = 5;

    public ProdutoImportado() {
    }

    public ProdutoImportado(double valor) {
        this.valor = valor;
    }

    public ProdutoImportado(String descricao, double valor) {
        this(valor);
        this.descricao = descricao;
    }

    public void exibirRelatorio() {
        double valorFinal = valor + ((valor * imposto) + (valor * taxa) + (valor * taxaImportacao)) / 100;
        System.out.println("Descricao: " + descricao +
                "\nValor: R$" + valor +
                "\nImposto: " + imposto + "%" +
                "\nTaxa: " + taxa + "%" +
                "\nTaxa de Importação: " + taxaImportacao + "%" +
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

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

}
