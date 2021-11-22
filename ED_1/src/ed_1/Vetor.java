
package ed_1;

import java.util.Arrays;

public class Vetor {
    
    //Atributos
    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;
    
    //Metodos
    private void garanteEspaco(){
        if (totalAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] =  alunos[i];
            }
            this.alunos = novoArray;
        }
    }
    
    private boolean posicaoValida(int posicao){
        this.garanteEspaco();
        return posicao >= 0 && posicao < totalAlunos;
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalAlunos;
    }
    
    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        //Null indica que existe uma posição vazia
        //Implementação com tempo constante
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }
    
    public void adiciona(int posicao, Aluno aluno){
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("posicao invalida");    
        }
        for(int i = totalAlunos - 1; i >= posicao; i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao]=aluno;
        totalAlunos++;
    }
    
    public Aluno devolver(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posicao invalida");
        }
        return alunos[posicao];
    }
    
    public void remover(int posicao){
        for (int i = posicao; i < this.totalAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalAlunos--;
    }
    
    // Para um vetor nao tem outra escolha a nao ser passar por todos os elementos
    public boolean contem(Aluno aluno){
        for(int i = 0; i < totalAlunos; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }
    
    public int tamanho(){
        return totalAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
