package heranca.ex02;

public class Nacional extends Produto {
    private double imposto = 10;
    private double taxa = 5;

    public Nacional() {
        super();
    }

    public Nacional(String descricao, double valor) {
        super(descricao, valor);
    }

    public double getImposto() {
        return this.imposto;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double calcularValorF() {
        return valor + (valor * imposto / 100) + (valor * taxa / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "imposto = " + imposto +
                "\nTaxa = " + taxa +
                "\nValor final = " + calcularValorF();
    }
}
