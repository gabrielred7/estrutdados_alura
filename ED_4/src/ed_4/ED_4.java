
package ed_4;
import java.util.LinkedList;
import java.util.Queue;

public class ED_4 {

    public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);
        
        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);
        
        /*
        Queue
        Da mesma forma que a estrutura de Pilhas tinha o nome 
        de Stack, à estrutura de Filas damos o nome de Queue.
        Para as filas os métodos têm os seguintes nomes: adiciona -> add e remove -> poll
        */
        Queue<String> queue = new LinkedList<String>();
        queue.add("Mauricio");
        queue.add("Paulo");
        queue.add("Guilherme");
        System.out.println(queue);
        String x = queue.poll();
        System.out.println(queue);
        queue.add("João");
        System.out.println(queue);
        String y = queue.poll();
        System.out.println(queue);
    }
}
