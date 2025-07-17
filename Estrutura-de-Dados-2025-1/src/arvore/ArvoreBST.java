package arvore;

public class ArvoreBST<T> {
    public No<T> raiz;

    public ArvoreBST() {
        this.raiz = null;
    }
    public void Adicionar(T novoValor){
        No<T> novoNo = new No<T>(novoValor);
        if (raiz==null) raiz = novoNo;
        
    }

}