package classeobjetos.aula02.ex5;

import java.util.Arrays;

public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private int cont;
    private int max;

    
    public void inicializarDepartamentos(int max) {
        this.max = max;
        departamentos = new Departamento[max];
        cont = 0;
    }

    public void adicionarDepartamento(Departamento d) {
        if (cont < max) {
            departamentos[cont] = d;
            cont++;
        }
    }

    public Departamento buscarDepartamento(String nome) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getNome().equals(nome))
                return departamentos[i];
        }
        return null;
    }

    public Funcionario buscarFuncionario(String nome) {
        for (int i = 0; i < cont; i++) {
            Funcionario f = departamentos[i].buscarFuncionario(nome);
            if (f != null)
                return f;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + "\ndepartamentos=" + Arrays.toString(departamentos) + "]";
    }

}
