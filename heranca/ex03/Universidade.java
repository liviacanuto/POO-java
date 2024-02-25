package heranca.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos = new ArrayList<>();

    public Universidade() {

    }

    public Universidade(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @param nome
     * @return Retorna o primeiro funcionario pelo nome caso exista
     */
    public Optional<Departamento> buscarDepartamento(String nome) {
        return departamentos.stream().filter(departamento -> departamento.getNome().equals(nome)).findFirst();
    }

    public void cadastrarDepartamento(Departamento d) {
        departamentos.add(d);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public int getQtdDepartamentos() {
        return this.departamentos.size();
    }

    public void exibirDepartamentos() {
        departamentos.stream().forEach(departamento -> System.out.println(departamento));
    }

    public void exibirTodosFuncionariosDepartamento() {
        departamentos.stream().forEach(departamento -> {
            System.out.println("*** Funcionarios do departamento: " + departamento.getNome() + "***");
            departamento.exibirFuncionarios();
        });
    }

    public void exibirTodosFuncionarios() {
        departamentos.stream().forEach(departamento -> departamento.exibirFuncionarios());
    }

    /**
     * 
     * 
     * @param min valor minimo da faixa de salario
     * @param max valor maximo da faixa de salario
     * 
     * @return Retorna lista de departamentos que tem funcionario com o salario
     *         entre uma faixa de salario
     */
    public List<Departamento> listarDepartamentosPorFaixaSalario(double min, double max) {
        return departamentos.stream()
                .filter(departamento -> !departamento.listarFuncionariosPorFaixaSalario(min, max).isEmpty())
                .toList();
    }

    /**
     * 
     * 
     * @param min valor minimo da faixa de valor
     * @param max valor maximo da faixa de valor
     * 
     * @return Retorna lista departamentos que tem gasto com salario dos
     *         funcionarios entre uma faixa de valor
     */
    public List<Departamento> listaDepartamentosPorFaixaDeGasto(double min, double max) {
        return departamentos.stream()
                .filter((departamento) -> {
                    double gasto = departamento.somarGastoDepartamento();
                    return gasto >= min && gasto <= max;
                })
                .toList();
    }

}
