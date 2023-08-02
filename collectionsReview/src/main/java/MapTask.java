import java.util.HashMap;
import java.util.Map;

public class MapTask {

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("TTony"));
        System.out.println(Character.MAX_VALUE);

    }


    public static Character firstNonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch,count+1);
            }else {
                map.put(ch,1);
            }
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch)==1){
                return ch;
            }
        }
        return Character.MAX_VALUE;
    }
}
