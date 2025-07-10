package arvore;

public class ArvoreBST {
    private No raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) return new No(valor);

        if (valor < atual.valor)
            atual.esquerda = inserirRec(atual.esquerda, valor);
        else if (valor > atual.valor)
            atual.direita = inserirRec(atual.direita, valor);
        // ignora valores duplicados

        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No atual, int valor) {
        if (atual == null) return false;
        if (valor == atual.valor) return true;
        return valor < atual.valor ? buscarRec(atual.esquerda, valor) : buscarRec(atual.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No atual, int valor) {
        if (atual == null) return null;

        if (valor < atual.valor) {
            atual.esquerda = removerRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = removerRec(atual.direita, valor);
        } else {
            // nó com apenas 1 filho ou nenhum
            if (atual.esquerda == null) return atual.direita;
            else if (atual.direita == null) return atual.esquerda;

            // nó com dois filhos: substitui pelo menor da subárvore direita
            atual.valor = menorValor(atual.direita);
            atual.direita = removerRec(atual.direita, atual.valor);
        }

        return atual;
    }

    private int menorValor(No no) {
        int min = no.valor;
        while (no.esquerda != null) {
            no = no.esquerda;
            min = no.valor;
        }
        return min;
    }

    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println();
    }

    private void emOrdemRec(No atual) {
        if (atual != null) {
            emOrdemRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRec(atual.direita);
        }
    }

    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println();
    }

    private void preOrdemRec(No atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            preOrdemRec(atual.esquerda);
            preOrdemRec(atual.direita);
        }
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println();
    }

    private void posOrdemRec(No atual) {
        if (atual != null) {
            posOrdemRec(atual.esquerda);
            posOrdemRec(atual.direita);
            System.out.print(atual.valor + " ");
        }
    }
}