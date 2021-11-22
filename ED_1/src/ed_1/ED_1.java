package ed_1;

import java.util.ArrayList;

public class ED_1 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.contem(a1));
        
        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));
       
        lista.adiciona(1, a3);
        System.out.println(lista);
        
        lista.remover(0);
        System.out.println(lista);
        
        for (int i = 0; i < 200; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);
        
        /* O Java já tem uma implementação de Vetor, 
        é a Classe conhecida por "ArrayList". */
        ArrayList<Aluno> listaJava = new ArrayList<Aluno>();
    }
}
