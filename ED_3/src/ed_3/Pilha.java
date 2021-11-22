
package ed_3;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
     /* 
    Pilha é uma estrutura de dados na qual o último elemento a entrar é o primeiro a sair
    A Pilha guarda os diversos estados de uma aplicação para que no futuro, 
    se necessário, seja possível voltar a estes estados. 
    */
    
    //Utiliza um pouco de Listas Ligadas mas já coma a implementação pronta do Java
    private List<String> nomes = new LinkedList<String>();
    
    public void insere(String nome) {
        nomes.add(nome);
    }

    public String remove() {
        return nomes.remove(nomes.size()-1);
    }
    
    //Este método indica se a lista está vazia ou não.
    public boolean vazia() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
    
    /*
    Usabilidade das pilhas

    O conceito de pilhas é muito utilizado por compiladores e autômatos. 
    Esta estrutura de dados tem muita usabilidade em ciências da computação. 
    O próprio, e muito conhecido, comando "Desfazer" dos editores de texto, 
    de código, de imagens, etc tem como base as pilhas. Podemos também brincar 
    com palavras e inverter a ordem de suas letras utilizando as pilhas.
    */
    
    /*
    Tempo de execução da pilha
    
    As operações aqui são sempre constantes, elas levam um tempo constante. 
    Porque inserir no fim de um Linked List é constante, remover em uma Linked List 
    no fim dela também é constante. Então essa nossa implementação, melhor impossível.
    */
}

