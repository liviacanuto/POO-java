package aula02.ex3;

public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
}
