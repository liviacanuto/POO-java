package heranca.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Da universidade é necessário armazenar somente o nome e os departamentos.
 * Os dados que deverão ser armazenados para o departamento são: Codigo, Nome,
 * Funcionários
 */
public class Departamento {
    private int codigo;
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento() {

    }

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncionarios() {
        return this.funcionarios.size();
    }

    /**
     * 
     * @param nome
     * @return Retorna o primeiro funcionario pelo nome caso exista
     */
    public Optional<Funcionario> buscarFuncionario(String nome) {
        return funcionarios.stream().filter(funcionario -> funcionario.getNome().equals(nome)).findFirst();
    }

    public void exibirFuncionarios() {
        funcionarios.stream().forEach(funcionario -> System.out.println(funcionario));
    }

    private Predicate<Funcionario> isDocente = f -> f instanceof Docente;

    public void exibirDocentes() {
        funcionarios.stream()
                .filter(isDocente)
                .forEach(funcionario -> System.out.println(funcionario));
    }

    private Predicate<Funcionario> isTecnico = f -> f instanceof Tecnico;

    public void exibirTecnicos() {
        funcionarios.stream()
                .filter(isTecnico)
                .forEach(funcionario -> System.out.println(funcionario));
    }

    /**
     * 
     * 
     * @param min valor minimo da faixa de salario
     * @param max valor maximo da faixa de salario
     * 
     * @return Retorna lista funcionarios que tem o salario entre uma faixa de
     *         salario
     */
    public List<Funcionario> listarFuncionariosPorFaixaSalario(double min, double max) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.salario >= min && funcionario.salario <= max)
                .toList();
    }

    public double somarGastoDepartamento() {
        return funcionarios.stream()
                .map(funcionario -> funcionario.getSalario())
                .collect(Collectors.summingDouble(Double::doubleValue));
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n";
    }
}
