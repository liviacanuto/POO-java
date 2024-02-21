package classeobjetos.aula02.ex5;

import java.util.Arrays;

public class Departamento {
    private int cod;
    private String nome;
    private String telefone;
    private Funcionario funcionarios[];
    private int cont;
    private int max;

    public void inicializarFuncionarios(int max) {
        this.max = max;
        funcionarios = new Funcionario[max];
        cont = 0;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (cont < max) {
            funcionarios[cont] = f;
            cont++;
        }
    }

    public Funcionario buscarFuncionario(String nome) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome))
                return funcionarios[i];
        }
        return null;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Departamento [cod=" + cod + ", nome=" + nome + ", telefone=" + telefone + ",funcionarios="
                + Arrays.toString(funcionarios) + "]";
    }

}
