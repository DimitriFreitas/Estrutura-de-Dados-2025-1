public class ListaEstaticaCircular {
    private int[] dados;
    private int tamanho;
    private int capacidade;

    public ListaEstaticaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.tamanho = 0;
    }

    // ➕ Anexar ao final
    public boolean anexar(int valor) {
        if (estaCheia()) return false;
        dados[tamanho++] = valor;
        return true;
    }

    // 📌 Inserir em posição específica
    public boolean inserir(int pos, int valor) {
        if (estaCheia() || pos < 0 || pos > tamanho) return false;
        for (int i = tamanho; i > pos; i--) {
            dados[i] = dados[i - 1];
        }
        dados[pos] = valor;
        tamanho++;
        return true;
    }

    // 🔍 Selecionar posição
    public int selecionar(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) return -1;
        return dados[pos];
    }

    // 📋 Selecionar todos
    public void selecionarTodos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i]);
        }
    }

    // 🔄 Atualizar valor
    public boolean atualizar(int pos, int novoValor) {
        if (pos < 0 || pos >= tamanho) return false;
        dados[pos] = novoValor;
        return true;
    }

    // ❌ Apagar valor por posição
    public boolean apagar(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) return false;
        for (int i = pos; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return true;
    }

    // ❌ Está cheia?
    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    // ⚠️ Está vazia?
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // 🖨️ Imprimir todos
    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

    // 🔍 Buscar índice
    public int indiceDe(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == valor) return i;
        }
        return -1;
    }

    // 🔎 Último índice
    public int ultimoIndiceDe(int valor) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (dados[i] == valor) return i;
        }
        return -1;
    }

    // ✅ Contém?
    public boolean contem(int valor) {
        return indiceDe(valor) != -1;
    }

    // 🗑️ Limpar tudo
    public void limpar() {
        tamanho = 0;
    }

    // 📏 Tamanho atual
    public int tamanho() {
        return tamanho;
    }

    // ➡️ Inserir no fim (mesmo que anexar)
    public boolean inserirFim(int valor) {
        return anexar(valor);
    }

    // 🔝 Inserir no início
    public boolean inserirInicio(int valor) {
        return inserir(0, valor);
    }

    // 🚪 Apagar do início
    public boolean apagarInicio() {
        return apagar(0);
    }

    // 🔚 Apagar do fim
    public boolean apagarFim() {
        return apagar(tamanho - 1);
    }

    // 🏁 Obter início
    public int obterInicio() {
        return selecionar(0);
    }

    // 🏁 Obter fim
    public int obterFim() {
        return selecionar(tamanho - 1);
    }
}