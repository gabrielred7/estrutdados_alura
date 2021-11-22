package ed_1;

import java.util.Objects;


/* O Armazenamento Sequencial. A ideia dessa estrutura é armazenar 
um aluno atrás do outro. Teremos um conjunto de espaços (Array)*/
public class Aluno {
    private String nome;
    
    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    /* O "equals" é o método que serve para comparar dois objetos, 
    no caso alunos. Faremos um casting do object para aluno. */
    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    // O "toString" retorna o nome do aluno:
    @Override
    public String toString() {
        return nome;
    }
}
