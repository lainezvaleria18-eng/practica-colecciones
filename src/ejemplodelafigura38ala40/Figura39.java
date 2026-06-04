package ejemplodelafigura38ala40;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Figura39 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();

        map.put(8, "programadores");
        map.put(10, "java");
        map.put(1, "queremos descansar");
        map.put(6, "ya estuvo el café");
        map.put(10, "java");
        map.put(15, "programadores");

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        System.out.println("");
        System.out.println("************************************************");
        System.out.println("///////////////// Mapa 2 ////////////////////////");

        Map<String, String> map1 = new HashMap();

        map1.put("Maria", "7851-9654");
        map1.put("Juana", "2536-9654");
        map1.put("Teresa", "7951-9654");
        map1.put("Amanda", "6051-9654");
        map1.put("Jaime", "2451-9654");
        map1.put("Jaime", "7548-9654");
        Iterator it1 = map1.keySet().iterator();

        while (it1.hasNext()) {
            String key = it1.next().toString();
            System.out.println("Clave: " + key + " -> Valor: " + map1.get(key));
        }
    }
}