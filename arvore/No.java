package arvore;

public class No<T> {
    private T valor;
    private No<T> direita;
    private No<T> esquerda;

    public No(T novoValor) {
        this.valor = novoValor;
        this.direita = null;
        this.esquerda = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }
}
