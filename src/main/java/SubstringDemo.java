import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SubstringDemo {

    public static void main(String[] args){
        System.out.println("RESULT is : "+twoStrings("hi", "world"));
    }

    static String twoStrings(String s1, String s2) {

       /* char[] charArray = s1.toCharArray();
        int len = charArray.length;
        String result = "NO";

        for (int i = 0; i < len; i++ ){
            if (s2.contains(ch)){
                result = "YES";
                break;
            }
        }
        return result;*/


       /*  char[] charArray = s1.toCharArray();
        int len = charArray.length;
        String result = "NO";

        for (int i = 0; i < len; i++ ){
            if (s2.contains(ch)){
                result = "YES";
                break;
            }
        }
        return result;*/




       /* char[] charArray = s1.toCharArray();
        char[] charArray1 = s2.toCharArray();

        int len = charArray.length;
        int len1 = charArray1.length;

        String result = "NO";


        for (int i = 0; i < len; i++ ){
            for (int j = 0; j < len1; j++){
                if (charArray[i] == charArray1[j]){
                    result = "YES";
                    break;
                }
            }
        }
        return result;*/




        /*char[] charArray = s1.toCharArray();
        int len = charArray.length;
        String result = "NO";
        for (int i = 0; i < len; i++ ){
            if (s2.indexOf(charArray[i]) != -1){
                result = "YES";
                break;
            }
        }
        return result;*/

        String result = "NO";
        List<Character> firstString  = s1.chars().mapToObj( e -> (char) e).collect(Collectors.toList());
        Set<Character> characterSet1 = new HashSet<>();
        characterSet1.addAll(firstString);

        List<Character> secondString  = s2.chars().mapToObj( e -> (char) e).collect(Collectors.toList());
        Set<Character> characterSet2 = new HashSet<>();
        characterSet2.addAll(secondString);

        characterSet1.retainAll(characterSet2);
        if(characterSet1.size() > 0){
            result = "YES";
        }
        System.out.println(characterSet1);
        return result;
    }
}
