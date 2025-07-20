package arvore;

public class No<T> {
    private T valor;
    private No<T> direita;
    private No<T> esquerda;
    private No<T> genitor;
    private int altura;

    public No(T novoValor) {
        this.valor = novoValor;
        this.direita = null;
        this.esquerda = null;
        this.altura = 0;
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

    public No<T> getGenitor() {
        return genitor;
    }

    public void setGenitor(No<T> genitor) {
        this.genitor = genitor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
