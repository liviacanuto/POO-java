package aula03.ex03;

public class MainEx03 {
    public static void main(String[] args) {
        Eletrodomestico e1 = new Eletrodomestico();
        e1.setNome("e1");
        e1.setPotenciaW(3);
        e1.setTempo(24);
        e1.exibirRelatorio(0.27);

        Eletrodomestico e2 = new Eletrodomestico("Forno Eletrico", 5, 10);
        e2.exibirRelatorio(1);
    }
}
