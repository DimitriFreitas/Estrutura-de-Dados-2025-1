package Heap;

public class TesteHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);

        heap.inserir(20);
        heap.inserir(15);
        heap.inserir(30);
        heap.inserir(5);
        heap.inserir(10);

        heap.imprimir(); // Deve mostrar: [30, 15, 20, 5, 10]

        System.out.println("Removido: " + heap.removerMax()); // 30
        heap.imprimir(); // [20, 15, 10, 5]
    }
}
