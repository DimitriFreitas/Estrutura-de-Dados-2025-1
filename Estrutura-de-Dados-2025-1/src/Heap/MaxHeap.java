package Heap;

import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int tamanho;
    private int capacidade;

    public MaxHeap(int capacidade) {
        this.capacidade = capacidade;
        heap = new int[capacidade];
        tamanho = 0;
    }

    private int pai(int i) { return (i - 1) / 2; }
    private int filhoEsquerdo(int i) { return 2 * i + 1; }
    private int filhoDireito(int i) { return 2 * i + 2; }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public boolean estaCheio() {
        return tamanho == capacidade;
    }

    public void inserir(int valor) {
        if (estaCheio()) {
            System.out.println("Heap cheio");
            return;
        }

        heap[tamanho] = valor;
        int atual = tamanho;
        tamanho++;

        while (atual > 0 && heap[atual] > heap[pai(atual)]) {
            trocar(atual, pai(atual));
            atual = pai(atual);
        }
    }

    public int removerMax() {
        if (estaVazio()) throw new IllegalStateException("Heap vazio");

        int raiz = heap[0];
        heap[0] = heap[tamanho - 1];
        tamanho--;
        maxHeapify(0);
        return raiz;
    }

    private void maxHeapify(int i) {
        int maior = i;
        int esquerda = filhoEsquerdo(i);
        int direita = filhoDireito(i);

        if (esquerda < tamanho && heap[esquerda] > heap[maior]) {
            maior = esquerda;
        }

        if (direita < tamanho && heap[direita] > heap[maior]) {
            maior = direita;
        }

        if (maior != i) {
            trocar(i, maior);
            maxHeapify(maior);
        }
    }

    private void trocar(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void imprimir() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOf(heap, tamanho)));
    }
}
