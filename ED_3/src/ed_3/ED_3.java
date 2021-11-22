
package ed_3;

import java.util.Stack;

public class ED_3 {

    public static void main(String[] args) {
        /*
        Pilha pilha = new Pilha();
        pilha.insere("Mauricio");
        System.out.println(pilha);

        pilha.insere("Guilherme");
        System.out.println(pilha);
        
        System.out.println(pilha.vazia());
        
        String r1 = pilha.remove();
        System.out.println(r1);

        String r2 = pilha.remove();
        System.out.println(r2);

        System.out.println(pilha);
        
        System.out.println(pilha.vazia());
        */
        
        /*
        O Java também já possui uma Classe própria para pilhas, 
        cujo nome é Stack. Substituindo os nomes de nossos métodos 
        para os da Classe do Java, temos:
        insere -> push e remove -> pop
        */
        Stack<String> stack = new Stack<String>();
        stack.push("Mauricio");
        stack.push("Marcelo");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("Guilherme");
        stack.push("Paulo");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("João");
        System.out.println(stack);
        
        /*
        O método peek trabalha em cima do elemento remove também, 
        porém sem removê-lo. Ele apenas o retorna.
        */
        
        String nome = stack.peek();
        System.out.println(nome);
    }   
}
