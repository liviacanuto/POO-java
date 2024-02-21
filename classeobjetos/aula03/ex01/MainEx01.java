package classeobjetos.aula03.ex01;

public class MainEx01 {
    public static void main(String[] argStrings) {
        Horario h1 = new Horario();
        h1.setHora(1);
        h1.setMinuto(30);
        h1.setSegundo(10);
        h1.exibirHorario();
        System.out.println(h1.calcularSegundos());

        Horario h2 = new Horario(5, 60, 10);
        h2.exibirHorario();
        System.out.println(h2.calcularSegundos());
    }
}
