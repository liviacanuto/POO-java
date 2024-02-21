package heranca.ex02;

// -Nacional: descricao, valor, imposto, taxa;
// -Importado: descricao, valor, imposto, taxa, taxaImportacao;

// O imposto do produto nacional é de 10% e taxa de 5%. O
// imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.

public class Estadual extends Produto {
    private double imposto = 10;

    public Estadual() {
        super();
    }

    public Estadual(String descricao, double valor) {
        super(descricao, valor);
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getImposto() {
        return imposto;
    }

    public double calcularValorF() {
        return valor + valor * imposto / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "imposto = " + imposto + "\n" + "valor final = " + calcularValorF();
    }
}
