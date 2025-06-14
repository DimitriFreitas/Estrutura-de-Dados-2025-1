package EstruturasDinamicas.fila_dinamica;

class No {
    int dado;
    No proximo;

    No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

public class FilaDinamica {
    private No inicio, fim;

    public void enfileirar(int valor) {
        No novo = new No(valor);
        if (fim != null) fim.proximo = novo;
        fim = novo;
        if (inicio == null) inicio = novo;
    }

    public int desenfileirar() {
        if (inicio == null) throw new RuntimeException("Fila vazia");
        int valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}

