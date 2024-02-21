package classeobjetos.aula02.ex4;

import java.util.Arrays;

public class Lista {
    private int vetor[];
    private int cont;
    private int max;

    public Lista(int max) {
        this.max = max;
        vetor = new int[max];
        cont = 0;
    }

    public boolean isVazia() {
        if (cont == 0)
            return true;
        return false;
    }

    public boolean isCheia() {
        if (cont == max)
            return true;
        return false;
    }

    public void adicionar(int valor) {
        if (!isCheia()) {
            vetor[cont] = valor;
            cont++;
        }
    }

    private int buscarPosicaoElem(int elem) {
        if (!isVazia()) {
            for (int i = 0; i < max; i++) {
                if (vetor[i] == elem) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void remover(int elem) {
        int index = buscarPosicaoElem(elem);
        if(index != -1) {
            vetor[index] = vetor[cont-1];
            cont--;
        }
    }

    @Override
    public String toString() {
        return "Lista [vetor=" + Arrays.toString(vetor) + ", cont=" + cont + ", max=" + max + "]";
    }
}
