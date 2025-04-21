
public class Fila {
    private int[] dados;
    private int inicio, fim, tamanho;

    public Fila(int capacidade) {
        dados = new int[capacidade];
        inicio = fim = tamanho = 0;
    }

    // 🔧 enqueue()
    public void enqueue(int valor) {
        if (isFull()) return;
        dados[fim] = valor;
        fim = (fim + 1) % dados.length;
        tamanho++;
    }

    // 🔧 dequeue()
    public int dequeue() {
        if (isEmpty()) return -1;
        int valor = dados[inicio];
        inicio = (inicio + 1) % dados.length;
        tamanho--;
        return valor;
    }

    // 🔧 front()
    public int front() {
        if (isEmpty()) return -1;
        return dados[inicio];
    }

    // ❌ isFull()
    public boolean isFull() {
        return tamanho == dados.length;
    }

    // ⚠️ isEmpty()
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // 🖨️ print()
    public void print() {
        int i = inicio;
        for (int c = 0; c < tamanho; c++) {
            System.out.println(dados[i]);
            i = (i + 1) % dados.length;
        }
    }
}