package heranca.ex01;

/**
 * A adição destes atributos irá influenciar o cálculo do preço, pois é preciso
 * somar essas taxas
 * ao preço base da peça (custo + lucro). O método exibir também deverá mostrar
 * os valores dos
 * atributos taxaImportacao e taxaFrete. Implemente também os métodos get e set
 * para todos os
 * atribuitos.
 * 
 * 
 * calculcarPreco( ):float;
 * exibir( );
 */

public class PecaImportada extends Peca {
    private double taxaImportacao;
    private double taxaFrete;

    public PecaImportada() {
        super();
    }

    public PecaImportada(String nome, double custo, double lucro, double taxaImportacao, double taxaFrete) {
        super(nome, custo,lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    @Override
    public double calcularPreco() {
        return this.getCusto() + this.getLucro() + this.taxaFrete + this.taxaImportacao;
    }

    @Override
    public String toString() {
        return ("Nome: " + this.getNome() +
                "\nCusto: " + this.getCusto() +
                "\nLucro: " + this.getLucro() +
                "\nTaxa Importacao: " + this.taxaImportacao +
                "\nTaxa Frete: " + this.taxaFrete);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    
    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public PecaImportada nome(String nome) {
        this.setNome(nome);
        return this;
    }
    
    public String nome() {
        return this.getNome();
    }

}
