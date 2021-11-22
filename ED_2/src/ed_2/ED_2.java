
package ed_2;

public class ED_2 {
    
    /*Lista Ligada: os elementos estão em lugares diferentes da memória, 
    só que um elemento aponta para o outro. Ele tem uma seta indicando 
    qual é o próximo. */
    
    /* Tentaremos acelerar a inserção no meio */
    
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        System.out.println(lista);
        lista.adicionaComeco("mauricio");
        System.out.println(lista);
        lista.adicionaComeco("paulo");
        System.out.println(lista);
        lista.adicionaComeco("guilherme");
        System.out.println(lista);
        lista.adicionaFim("marcelo");
        System.out.println(lista);
        lista.adicionaMeio(3, "clara");
        System.out.println(lista);
        
        Object x = lista.pega(2);
        System.out.println(x);
        int y = lista.tamanho();
        System.out.println(y);
        
        lista.removeComeco();
        System.out.println(lista);
        lista.removeFim();
        System.out.println(lista);
        
        
        lista.removeMeio(1);
        System.out.println(lista);
    }
}
