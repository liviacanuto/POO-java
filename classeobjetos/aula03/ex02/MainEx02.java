package classeobjetos.aula03.ex02;

public class MainEx02 {
    public static void main(String[] argStrings) {
        ContaEspecial c1 = new ContaEspecial();
        c1.setTitular("pessoa1");
        c1.setLimite(100);
        c1.depositar(200);
        System.out.println(c1.sacar(300.01));
        System.out.println(c1.getSaldo() + c1.getLimite());

        ContaEspecial c2 = new ContaEspecial("pessoa2", 50);
        System.out.println(c2.sacar(50));
    }
}
