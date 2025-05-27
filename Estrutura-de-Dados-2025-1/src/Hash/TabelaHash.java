package Hash;

public class TabelaHash {
    private Integer[] tabela;
    private int tamanho;

    public TabelaHash(int capacidade) {
        tabela = new Integer[capacidade];
        tamanho = 0;
    }

    private int hash(int chave) {
        return chave % tabela.length;
    }

    public boolean inserir(int chave) {
        if (tamanho == tabela.length) return false; // tabela cheia

        int pos = hash(chave);
        int inicial = pos;

        while (tabela[pos] != null) {
            if (tabela[pos].equals(chave)) return false; // duplicata
            pos = (pos + 1) % tabela.length;
            if (pos == inicial) return false; // ciclo completo
        }

        tabela[pos] = chave;
        tamanho++;
        return true;
    }

    public boolean remover(int chave) {
        int pos = buscarPosicao(chave);
        if (pos == -1) return false;

        tabela[pos] = null;
        tamanho--;

        // Reorganizar elementos para evitar falhas na busca futura
        pos = (pos + 1) % tabela.length;
        while (tabela[pos] != null) {
            int rehash = tabela[pos];
            tabela[pos] = null;
            tamanho--;
            inserir(rehash);
            pos = (pos + 1) % tabela.length;
        }

        return true;
    }

    public int buscarPosicao(int chave) {
        int pos = hash(chave);
        int inicial = pos;

        while (tabela[pos] != null) {
            if (tabela[pos].equals(chave)) return pos;
            pos = (pos + 1) % tabela.length;
            if (pos == inicial) break;
        }

        return -1;
    }

    public boolean buscar(int chave) {
        return buscarPosicao(chave) != -1;
    }

    public void imprimir() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.printf("Posição %d: %s\n", i, tabela[i] == null ? "-" : tabela[i].toString());
        }
    }
}
