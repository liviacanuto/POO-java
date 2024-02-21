package heranca.ex02;

// -Importado: descricao, valor, imposto, taxa, taxaImportacao;

// O imposto do produto estadual é de 10%. O imposto do produto nacional é de 10% e taxa de 5%. O
// imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.
// Faça um método relatório para cada classe, o qual informa o conteúdo dos atributos e o valor do
// produto.
public class Importado extends Produto {
    private double imposto = 10;
    private double taxa = 5;
    private double taxaImportacao = 5;

    public Importado() {
        super();
    }

    public Importado(String descricao, double valor) {
        super(descricao, valor);
    }

    public double getImposto() {
        return this.imposto;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public double getTaxaImportacao() {
        return this.taxaImportacao;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularValorF() {
        return valor + (valor * imposto / 100) + (valor * taxa / 100 + (valor * taxaImportacao / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "imposto = " + imposto +
                "\nTaxa = " + taxa +
                "\nTaxa Importacao = " + taxaImportacao +
                "\nValor final = " + calcularValorF();
    }

}
