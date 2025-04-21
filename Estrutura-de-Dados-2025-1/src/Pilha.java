
public class Pilha {
    private int[] dados;
    private int topo;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    // 🔧 push()
    public void push(int valor) {
        if (isFull()) return;
        dados[++topo] = valor;
    }

    // 🔧 pop()
    public int pop() {
        if (isEmpty()) return -1;
        return dados[topo--];
    }

    // 🔧 top()
    public int top() {
        if (isEmpty()) return -1;
        return dados[topo];
    }

    // ⚠️ isEmpty()
    public boolean isEmpty() {
        return topo == -1;
    }

    // ❌ isFull()
    public boolean isFull() {
        return topo == dados.length - 1;
    }

    // 🖨️ print()
    public void print() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}
