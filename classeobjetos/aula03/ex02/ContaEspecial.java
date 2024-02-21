package classeobjetos.aula03.ex02;

public class ContaEspecial {
    private String titular;
    private double saldo;
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldo = 0;
    }

    public String sacar(double valor) {
        if ((saldo + limite) >= valor) {
            saldo = saldo - valor;
            return "Saque de R$" + valor + " bem sucedido";
        }
        return "Saldo insuficiente para sacar: R$" + valor;
    }

    public String depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return "Deposito bem sucedido";
        }
        return "Deposito Negativo! Erro";
    }

    public void exibirAtributos() {
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo + "\nLimite: " + limite);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
