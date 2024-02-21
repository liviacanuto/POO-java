package heranca.ex02;

public class MainEx02 {
    public static void main(String[] args) {
        Estadual pE = new Estadual("pao", 100.0);
        System.out.println("\n********Produto Estadual*******\n");
        System.out.println(pE);

        Nacional pN = new Nacional("queijo", 100.0);
        System.out.println("\n********Produto Nacional*******\n");
        System.out.println(pN);

        Importado pI = new Importado("queijo", 100.0);
        System.out.println("\n********Produto Importado*******\n");
        System.out.println(pI);
    }
}
