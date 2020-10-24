import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {
    public static void main(String[] args) {
   count("hkshfhhhs");
    }
    public static void count(String s){
        int countDuplicates=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.compute(s.substring(i,i+1),(k,v)->v==null?1:v+1);
        }
        System.out.println(map);
        for(String k:map.keySet()){
            if(map.get(k)>=2)
                countDuplicates++;

        }
        System.out.println("duplicates = "+countDuplicates);
    }
}
