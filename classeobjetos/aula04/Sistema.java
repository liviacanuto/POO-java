package classeobjetos.aula04;

public class Sistema {
    private int MAX = 3;
    // criar metodo exibirProdutoBuscado()

    public void executar() {
        ProdutoEstadual pE1 = new ProdutoEstadual("1", 100.0);
        ProdutoEstadual pE2 = new ProdutoEstadual("2", 200.0);
        ProdutoEstadual pE3 = new ProdutoEstadual("3", 300.0);

        ProdutoEstadual produtosEstaduais[] = new ProdutoEstadual[MAX];
        produtosEstaduais[0] = pE1;
        produtosEstaduais[1] = pE2;
        produtosEstaduais[2] = pE3;

        ProdutoNacional pN1 = new ProdutoNacional("1", 100.0);
        ProdutoNacional pN2 = new ProdutoNacional("2", 200.0);
        ProdutoNacional pN3 = new ProdutoNacional("3", 300.0);

        ProdutoNacional produtosNacionais[] = new ProdutoNacional[MAX];
        produtosNacionais[0] = pN1;
        produtosNacionais[1] = pN2;
        produtosNacionais[2] = pN3;

        ProdutoImportado pI1 = new ProdutoImportado("1", 100.0);
        ProdutoImportado pI2 = new ProdutoImportado("2", 200.0);
        ProdutoImportado pI3 = new ProdutoImportado("3", 300.0);

        ProdutoImportado produtosImportados[] = new ProdutoImportado[MAX];
        produtosImportados[0] = pI1;
        produtosImportados[1] = pI2;
        produtosImportados[2] = pI3;

        exibirRelatorioPI(produtosImportados);
        exibirRelatorioPE(produtosEstaduais);
        exibirRelatorioPN(produtosNacionais);
    }

    private void exibirRelatorioPE(ProdutoEstadual vetor[]) {
        System.out.println("*******Relatorio Produtos Estaduais******");
        for (int i = 0; i < MAX; i++) {
            vetor[i].exibirRelatorio();
            System.out.println();
        }
    }

    private void exibirRelatorioPN(ProdutoNacional vetor[]) {
        System.out.println("******Relatorio Produtos Nacionais*******");
        for (int i = 0; i < MAX; i++) {
            vetor[i].exibirRelatorio();
            System.out.println();
        }
    }

    private void exibirRelatorioPI(ProdutoImportado vetor[]) {
        System.out.println("******Relatorio Produtos Importados*******");
        for (int i = 0; i < MAX; i++) {
            vetor[i].exibirRelatorio();
            System.out.println();
        }
    }
}
