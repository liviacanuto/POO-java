import aula02.ex5.Departamento;
import aula02.ex5.Funcionario;
import aula02.ex5.Universidade;

public class Main {

    public static void main(String[] argStrings) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Fun 1");
        f1.setCod(111);
        f1.setFuncao("ADM");
        f1.setSalario(2500);
        Funcionario f2 = new Funcionario();
        f2.setNome("Fun 2");
        f2.setCod(222);
        f2.setFuncao("TI");
        f2.setSalario(5000);

        Departamento d1 = new Departamento();
        d1.inicializarFuncionarios(10);
        d1.setNome("ADM");
        d1.setCod(1);
        d1.adicionarFuncionario(f1);
        Departamento d2 = new Departamento();
        d2.inicializarFuncionarios(10);
        d2.setNome("TI");
        d2.setCod(2);
        d2.adicionarFuncionario(f2);

        Universidade univ = new Universidade();
        univ.setNome("UNIFESP");
        univ.inicializarDepartamentos(10);
        univ.adicionarDepartamento(d1);
        univ.adicionarDepartamento(d2);

        System.out.println(univ);
    }
}
