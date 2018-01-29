package Uzduotis11;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main11 {
    public static void main(String[] args) {

        Map<Long, String[]> zmones = new TreeMap<>();
        zmones.put(44512200123L, new String[]{"Janina", "Onaitė"});
        zmones.put(38009090102L, new String[]{"Jonas", "Jonaitis"});
        zmones.put(36712301490L, new String[]{"Antanas", "Antanaitis"});
        zmones.put(46510200143L, new String[]{"Ona", "Onaitė"});
        zmones.put(36011030147L, new String[]{"Petras", "Petraitis"});
        zmones.put(39001300090L, new String[]{"Kazys", "Antanaitis"});
        zmones.put(46510200143L, new String[]{"Inga", "Onaitė"});

        System.out.println("\nŽmonės pagal Asmens kodą:");
        for (Long z : zmones.keySet()) {
            System.out.println(z + " " + zmones.get(z)[0] + " " + zmones.get(z)[1]);
        }
    }
}
