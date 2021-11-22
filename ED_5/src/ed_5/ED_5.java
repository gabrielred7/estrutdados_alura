package ed_5;

import java.util.HashSet;
import java.util.Set;

public class ED_5 {

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);
        
        conjunto.adiciona("Ricardo");
        System.out.println(conjunto);
        
        conjunto.adiciona("Gabriel");
        System.out.println(conjunto);
        
        conjunto.adiciona("Roberta");
        System.out.println(conjunto);
        
        conjunto.remove("Mauricio");
        System.out.println(conjunto);
        
        Set<String> set = new HashSet<String>();
        set.add("Mauricio");
        set.add("Mauricio");
        set.add("Guilherme");
        set.add("Paulo");
        String x = "Guilherme";
        x.hashCode();
        System.out.println("Guilherme".hashCode());
    } 
}
