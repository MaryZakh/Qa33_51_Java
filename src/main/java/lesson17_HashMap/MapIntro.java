package lesson17_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {

    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap<>();
        System.out.println(months.put("Jan", 1));
        //System.out.println(months.put("Jan",100));
        months.put("Feb", 2);
        months.put("Mar", 3);
        months.put("Apr", 4);
        System.out.println(months);
        months.put("Jan", 100);
        System.out.println(months);
        System.out.println(months.put(null, 1));
        System.out.println(months.put("Jul", null));
        System.out.println(months);
        //months.clear();
        System.out.println(months.isEmpty());
        //======================================
        System.out.println(months.putIfAbsent("Jan", 1));
        System.out.println(months);
        //======================================
        System.out.println(months.get("Aprrr"));
        System.out.println(months.getOrDefault("Aprrr", 10500));
        //======================================
        System.out.println(months.remove("Jul"));
        System.out.println(months);
        months.put("Jul", 7);
        System.out.println(months);
        System.out.println(months.remove("Jul", 10));
        System.out.println(months);
        //======================================
        System.out.println(months.replace("Jul", 1000));
        System.out.println(months);
        System.out.println(months.replace("Jul", 1000, 2000));
        System.out.println(months);
        System.out.println(months.replace("Jul", 1000, 4000));
        System.out.println(months);
        System.out.println(months.replace("Julll", 1000));
        System.out.println(months);
        System.out.println("===========");
        //======================================
        Set<String> keys = months.keySet();
        for (String s : keys) {
            //System.out.println(s);
            System.out.println(s + " ->" + months.get(s));
        }
        System.out.println("===========");
        for (Integer n : months.values()) {
            System.out.println(n);
        }
        System.out.println("===========");
        for (Map.Entry<String, Integer> en : months.entrySet()) {
            String key = en.getKey();
            Integer val = en.getValue();
            if(val ==100)
            System.out.println(key + " "+ val);
            System.out.println(en);
        }

    }
}
