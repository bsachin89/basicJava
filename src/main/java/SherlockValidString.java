import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class SherlockValidString {

    public static void main(String[] args){
        System.out.println(isValid("abcdefghhgfedecba"));
    }

    private static String isValid(String s) {
        String isValid = "NO";
        Map<Character, Integer> map = getNoOfOccurences(s);
        Collection<Integer> set = map.values();
        Set<Integer> values = new TreeSet<>();
        values.addAll(set);
        if(!values.isEmpty() && values.size() == 1){
            isValid = "YES";
        }
        return isValid;
    }

    private static  Map<Character, Integer> getNoOfOccurences(final String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charsOfString = s.toCharArray();
        int len = s.length();
        Character character;
        for(int i = 0; i< len; i++){
            character = charsOfString[i];
            if(map.containsKey(character)){
               map.put(character, (map.get(character)+1));
            } else{
                map.put(character, 1);
            }
        }
        return map;
    }
}
