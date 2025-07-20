package arvore;

public class ArvoreAvl<T extends Comparable<T>> {

    private No<T> raiz;

    public ArvoreAvl(No<T> raiz) {
        this.raiz = raiz;
    }
    public void adicionar(T novoValor){
        raiz = adicionarRec(raiz,novoValor);
    }
    private No<T> adicionarRec(No<T>atual,T novoValor){
        //inicio do metodo
        if (atual==null){
            return new No<T>(novoValor);
        }
        int comparacao = novoValor.compareTo(atual.getValor());

        if (comparacao < 0) {
            // Insere recursivamente na subárvore esquerda
            //Sempre que atual.getEsquerda for nulo, o o inicio do metodo recursivo chamado insere No<T> filho a esquerda
            No<T> filho = adicionarRec(atual.getEsquerda(), novoValor);
            filho.setGenitor(atual); // atualiza o genitor
            atual.setEsquerda(filho); // atualiza o filho
        } else {
            // Insere recursivamente na subárvore direita
            //Sempre que atual.getDireita for nulo, o inicio do metodo recursivo chamado insere No<T> filho a direita
            No<T> filho = adicionarRec(atual.getDireita(), novoValor);
            filho.setGenitor(atual);
            atual.setDireita(filho);
        }
        atualizaAltura(atual);
        return atual;
    }



}
