package arvore;

public class ArvoreBST<T extends Comparable<T>> {
    public No<T> raiz;

    public ArvoreBST() {
        this.raiz = null;
    }//construtor

    //metodo Adicionar, adiciona um nó a raiz caso vazia, a direita caso maior valor, a esquerda caso menor

    public void Adicionar(T novoValor){
        No<T> novoNo = new No<T>(novoValor);
        if (raiz==null) raiz = novoNo;
        else {
        No<T> atual = this.raiz;
        while(true){
        if (novoNo.getValor().compareTo(atual.getValor()) ==-1){
            if (atual.getEsquerda()!=null) {
                atual = atual.getEsquerda();
            }else{
                atual.setEsquerda(novoNo);
                break;
            }

        }else{
            if (atual.getDireita()!=null) {
                atual = atual.getDireita();
            }else{
                atual.setEsquerda(novoNo);
                break;
            }
        }


}}}}