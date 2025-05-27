package Hash;

public class TesteHash {
    public static void main(String[] args) {
        TabelaHash hash = new TabelaHash(7);

        hash.inserir(10);
        hash.inserir(3);
        hash.inserir(17); // colisão com 3 (17 % 7 == 3)
        hash.inserir(24); // colisão com 3 e 17 (24 % 7 == 3)

        System.out.println("Tabela após inserções:");
        hash.imprimir();

        System.out.println("\nBuscar 17: " + hash.buscar(17)); // true
        System.out.println("Remover 3: " + hash.remover(3)); // true

        System.out.println("\nTabela após remoção:");
        hash.imprimir();
    }
}

