package arvore;

public class ArvoreAvl<T extends Comparable<T>> {

    private No<T> raiz;

    public ArvoreAvl(No<T> raiz) {
        this.raiz = raiz;
    }
    public void adicionar(T novoValor){
        raiz = adicionarRec(raiz,novoValor);
    }
    private No<T> adicionarRec(No<T>atual,T valor){
        if (atual==null){
            return new No<T>(novoValor);
        }
    }
}
