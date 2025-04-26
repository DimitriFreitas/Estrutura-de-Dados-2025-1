package ordenacao;

public class AlgoritmosOrdenacao {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    trocar(array, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            trocar(array, i, menor);
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }

    private static void trocar(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void imprimir(int[] array) {
        for (int v : array) System.out.print(v + " ");
        System.out.println();
    }
}

