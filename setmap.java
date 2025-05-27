import java.util.*;
public class setmap {
    public static void main(String[]args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0" , 1)  ;
        map.put("id1" , 2)  ;
        map.put("id2" , 3)  ;
        map.put("id3" , 4)  ;
        System.out.println(map.get("id0")); 
        System.out.println(map.get("id3"));


    }
}