
package ed_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
Conjuntos são estruturas de dados que não permitem dados repetidos.

Para garantir que os dados não fiquem repetidos, conjuntos fazem 
uso de funções de hash para espalhar bem os dados, e em seguida, 
varrer o conteúdo de maneira eficiente.

Para criarmos um conjunto, precisaremos inserir elementos 
- não repetidos, algo que já vimos com o LinkedList. 
*/

public class Conjunto {
    
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
    
    public Conjunto() {
        for(int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }
    
    //Um método que nos auxiliará a calcular o índice da lista maior
    private int calculaIndiceTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }
    
   
    /*
    A busca em um conjunto é rapida, porque os elementos são guardados de maneira estruturada dentro do conjunto.
    Por exemplo, ao invés de guardarmos todos os nomes em uma mesma lista, temos 26 listas diferentes, 
    uma para cada letra do alfabeto. Então, ao buscarmos pelo nome "Mauricio", ele varrerá apenas a lista 
    com os nomes que começam com M.

    Essa função de espalhamento, conhecida como função de hash é o segredo. Se ela espalhar bem os dados entre 
    as categorias, então a busca em um conjunto será extremamente eficiente.
    */
    private boolean contem(String palavra) {
        int indice = calculaIndiceTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }
    
    public void adiciona(String palavra){
        if(!contem(palavra)) {
            int indice = calculaIndiceTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add(palavra);
        }
    }
    
    public void remove(String palavra) {
        if(contem(palavra)) {
            int indice = calculaIndiceTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.remove(palavra);
        }
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}