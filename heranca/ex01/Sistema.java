package heranca.ex01;

public class Sistema {
    private int MAX = 5;

    public void executar() {

        Peca v1[] = new Peca[MAX];
        PecaImportada v2[] = new PecaImportada[MAX];

        for (int i = 0; i < MAX; i++) {
            Peca p = new Peca(i + "", i * 10, i * 100);
            v1[i] = p;
        }

        for (int i = 0; i < MAX; i++) {
            PecaImportada p = new PecaImportada(i + "", i * 10, i * 100, i, i + 10);
            v2[i] = p;
        }

        Peca p1 = new PecaImportada();
        System.out.println(p1 instanceof Peca);

        PecaImportada p2 = new PecaImportada().nome("overloading");
        p2.setTaxaFrete(MAX);
        System.out.println(p2.nome());

        exibirPecas(v1);
        exibirPecas(v2);

    }

    private void exibirPecas(Peca vetor[]) {
        System.out.println("*************");
        for (int i = 0; i < MAX; i++) {
            System.out.println(vetor[i]);
            System.out.println();
        }
    }
}
