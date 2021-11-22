
package ed_2;

/* Lista Ligada possui so uma seta, que é para frente
   Lista Duplamente Ligada possui duas setas, uma para frente e a outra para trás. A grande vantagem é que muitas operações necessitam também da célular anterior, e tudo fica mais fácil com a referência armazenada em cada célula.
*/

public class ListaLigada {
    
    private Celula primeiro = null;
    private Celula ultimo = null;
    private int totalElementos = 0;
    
    /* Indica quando a posição existir, estiver ocupada */
    private boolean posicaoInvalida(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }
    
    /* Aponta para a célula na qual queremos inserir o elemento */
    private Celula pegaCelula(int posicao){
        if (!posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("posicao invaldia");
        }
        
        Celula atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
    
    /*Em ambos os casos começo e fim o tempo é constante. Assim como na lista ligada simples, 
    basta acertar as referências, já que a estrutura armazena o primeiro e ultimo nós.*/
    public void adicionaComeco(Object elemento) {
        if(this.totalElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeiro = nova;
            this.ultimo = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeiro);
            this.primeiro.setAnterior(nova);
            this.primeiro = nova;
        }
        this.totalElementos++;
    }
    
    public void adicionaFim(Object elemento){
        if (this.totalElementos == 0) {
            adicionaComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultimo.setProximo(nova);
            nova.setAnterior(this.ultimo);
            this.ultimo = nova;
            this.totalElementos++;
        }
    }
    
    public void adicionaMeio(int posicao, Object elemento){
        if (posicao == 0) {
            adicionaComeco(elemento);
        } else if (posicao == this.totalElementos) {
            this.adicionaFim(elemento);
        } else {            
            //Pega a célula anterior e marcar o proximo dela como X
            Celula anterior = this.pegaCelula(posicao - 1);
            
            //Pega a antiga célula proximo da anterior, e marcar a anterior dela como X
            Celula proxima = anterior.getProximo();
            
            Celula nova = new Celula(elemento, anterior.getProximo());
            nova.setAnterior(anterior);
            
            //Marca anterior de X como a antiga anterior
            anterior.setProximo(nova);
            
            //Marca proxima de X como sendo a antiga proxima
            proxima.setAnterior(nova);
            this.totalElementos++;
        }
    }
    
    /* Obs: Recuper um elemento em uma posição aleatória pode levar tempo linear.
    Pois em uma lista ligada, precisamos navegar pelas referências até encontrar o elemento desejado */
    public Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }
    
    public int tamanho(){
        return this.totalElementos;
    }
    
    /*
    A remoção em uma lista ligada pode ser ou linear ou constante.
    Se você tiver a referência em mãos da célula que será deletada, então o tempo é constante. Afinal, 
    já que você tem anterior e proximo nas mãos, basta acertar as referências.
    Se você precisar procurar pelo elemento primeiro, então o tempo será linear, afinal passará por todas as células no pior caso.
    */
    public void removeComeco() {
        if(this.totalElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeiro = this.primeiro.getProximo();
        this.totalElementos--;
        if(this.totalElementos == 0) {
            this.ultimo = null;
        }
    }
    
    public void removeFim() {
        if(this.totalElementos == 1) {
            this.removeComeco();
        } else {
            Celula penultima = this.ultimo.getAnterior();
            penultima.setProximo(null);
            this.ultimo = penultima;
            this.totalElementos--;
        }
    }
    
    public void removeMeio(int posicao){
        if(posicao == 0) {
            this.removeComeco();
        } else if (posicao == this.totalElementos - 1) {
            this.removeFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();

            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);

            this.totalElementos--;
        }
    }
    
    public boolean contem(Object elemento){
        Celula atual = this.primeiro;
        while(atual != null){
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    @Override
    public String toString() {
        if (this.totalElementos == 0) {
            return "[]";
        }
        Celula atual = primeiro;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totalElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
}
