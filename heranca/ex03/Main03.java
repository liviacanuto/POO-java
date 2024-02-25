package heranca.ex03;

public class Main03 {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("UNIFESP");
        Departamento departamento = new Departamento(1, "TI");
        Docente docente = new Docente(5, "docente", 50, "Titulado");
        Tecnico tecnico = new Tecnico(4, "tecnico", 00, "Titulado");
        universidade.cadastrarDepartamento(departamento);
        departamento.cadastrarFuncionario(docente);
        departamento.cadastrarFuncionario(tecnico);
        System.out.println(universidade.listaDepartamentosPorFaixaDeGasto(51, 510));

    }
}
