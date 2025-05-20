package ordenação;

public class TesteOrdenacao {
    public static void main(String[] args) {
        int[] original = {5, 3, 8, 4, 2};

        int[] a = original.clone();
        System.out.print("Bubble Sort: ");
        AlgoritmosOrdenacao.bubbleSort(a);
        AlgoritmosOrdenacao.imprimir(a);

        int[] b = original.clone();
        System.out.print("Selection Sort: ");
        AlgoritmosOrdenacao.selectionSort(b);
        AlgoritmosOrdenacao.imprimir(b);

        int[] c = original.clone();
        System.out.print("Insertion Sort: ");
        AlgoritmosOrdenacao.insertionSort(c);
        AlgoritmosOrdenacao.imprimir(c);
    }
}
