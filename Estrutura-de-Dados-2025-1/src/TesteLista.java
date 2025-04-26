public class TesteLista {
    public static void main(String[] args) {
        ListaEstaticaCircular lista = new ListaEstaticaCircular(10);

        System.out.println("📋 Testando Lista Estática Circular:");

        // ➕ Inserções
        lista.anexar(10);
        lista.anexar(20);
        lista.anexar(30);
        lista.inserir(1, 15); // inserindo 15 na posição 1

        // 🖨️ Imprimir lista
        System.out.print("Lista após inserções: ");
        lista.imprimir();

        // 🔍 Consultas
        System.out.println("Elemento na posição 2: " + lista.selecionar(2));
        System.out.println("Índice do valor 30: " + lista.indiceDe(30));
        System.out.println("Contém 25? " + lista.contem(25));

        // 🔄 Atualização
        lista.atualizar(2, 25);
        System.out.print("Lista após atualizar posição 2 para 25: ");
        lista.imprimir();

        // ❌ Remoções
        lista.apagar(1); // remove o 15
        lista.apagarFim(); // remove último (30)
        System.out.print("Lista após remoções: ");
        lista.imprimir();

        // 🏁 Operações de início/fim
        lista.inserirInicio(5);
        lista.apagarInicio();
        lista.inserirFim(100);
        System.out.print("Lista final: ");
        lista.imprimir();

        // 📏 Tamanho
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 🗑️ Limpar
        lista.limpar();
        System.out.print("Após limpar: ");
        lista.imprimir();
    }
}
