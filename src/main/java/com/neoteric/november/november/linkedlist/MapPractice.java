package com.neoteric.november.november.linkedlist;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        // inserted the data into th emap
        map1.put("telugu",75);
        map1.put("hindi",65);
        map1.put("english",90);
        map1.put("maths",80);
        map1.put("science",80);
        map1.put("social",95);

        //retreive the data from ma
      Set<Map.Entry<String,Integer>> entrySet1 =  map1.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entrySet1.iterator();
       while (iterator.hasNext()){
           Map.Entry<String,Integer> entrymap=iterator.next();
           System.out.println(entrymap.getKey()+"value"+entrymap.getValue());
       }

       map1.entrySet().stream().forEach(entry2 ->{
           System.out.println(entry2.getKey()+"value"+entry2.getValue());
       });

        Map<String,Integer> treemap1=new TreeMap<>();
        // inserted the data into th emap
        treemap1.put("fatelugu",75);
        treemap1.put("ebhindi",65);
        treemap1.put("dcenglish",90);
        treemap1.put("cdmaths",80);
        treemap1.put("bescience",80);
        treemap1.put("afsocial",95);

        treemap1.entrySet().stream().forEach(entry23 ->{
            System.out.println(entry23.getKey()+"value"+entry23.getValue());
        });
    }

}
