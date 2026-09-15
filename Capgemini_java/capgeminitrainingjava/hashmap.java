package capgeminitrainingjava; 

import java.util.Collection; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.Set; 

class hashmap { 
    public static void main(String[] args) { 
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("John", 1); 
        map.put("Smith", 17); 
        map.put("Raj", 27); 
        
        System.out.println(map); 
        map.replace("Raj", null); 
        System.out.println(map); 
        
        System.out.println(map.get("John")); 
        System.out.println(map.containsKey("Smith")); 
        System.out.println(map.containsValue(27)); 
        System.out.println(map); 
        
        map.putIfAbsent("Jerry", 6);
        System.out.println(map);
        map.remove("Jerry");
        map.replace("Raj", null); 
        
        Set<String> k = map.keySet(); 
        for (String l : k) { 
            System.out.println(l); 
        } 
        
        // FIX 1 & 2: Get and store values cleanly
        Collection<Integer> v = map.values(); 
        
        // FIX 3: Changed the invalid '1' identifier to 'entry'
        Set<Entry<String, Integer>> ele = map.entrySet(); 
        for(Integer l1: v) {
        	System.out.println(l1);
        }
        
        for (Map.Entry<String, Integer> entry : ele) { 
            System.out.println(entry.getKey() + " => " + entry.getValue()); 
        } 
    } 
}









//package capgeminitrainingjava;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
// class hashmap {
//	 public static void main(String[] args) {
//		 HashMap<String, Integer> map=new HashMap<>();
//		 map.put("John", 1);
//		 map.put("Smith", 17);
//		 map.put("Raj",27);
//		 System.out.println(map);
//		 map.replace("Raj",null);
//		 
//		 System.out.println(map);
//		 System.out.println(map.get("John"));
//		 System.out.println(map.containsKey("Smith"));
//		 System.out.println(map.containsKey(27));
//		 System.out.println(map);
//		 
//		 map.replace("Raj", null);
//		 Set<String> k=map.keySet();
//		 for(String l:k) {
//			 System.out.println(l);
//			 }
////		 Collection<Integer> v=map
////		 Set<Entry<String, Integer>> ele=map.entrySet();
////		 for(Map.Entry<String,Integer>1:ele) {
////			 System.out.println(l);
////		 }
//		 }
//}
