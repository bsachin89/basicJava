import java.util.*;

public class AnagramDemo {

    public static void main(String[] args){
        //
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));

        //System.out.println(makeAnagram("abc", "cde"));

    }

    private static int makeAnagram(String a, String b) {
        int noOfCharactersToRemove = 0;
        Map<Character, Integer> firstStringOccurences = convertToMap(a);
        Map<Character, Integer> secondStringOccurences = convertToMap(b);
        System.out.println(firstStringOccurences);
        System.out.println(secondStringOccurences);


       Iterator<Map.Entry<Character, Integer>> it = firstStringOccurences.entrySet().iterator();

       int count = 0;
        while (it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            if (secondStringOccurences.containsKey(entry.getKey())){
                if(entry.getValue() == secondStringOccurences.get(entry.getKey())){
                    secondStringOccurences.remove(entry.getKey());
                    it.remove();
                } else{
                    count = entry.getValue() - secondStringOccurences.get(entry.getKey());
                    if(count < 0){
                        count = count * (-1);
                    }
                    noOfCharactersToRemove = noOfCharactersToRemove + count;
                    secondStringOccurences.remove(entry.getKey());
                    it.remove();

                }
            } else{
                noOfCharactersToRemove = noOfCharactersToRemove + entry.getValue();

            }
        }

        for(Map.Entry<Character, Integer> entry : secondStringOccurences.entrySet()){
            noOfCharactersToRemove = noOfCharactersToRemove + entry.getValue();
        }

        return noOfCharactersToRemove;

/*
        for(Map.Entry<Character, Integer> first : firstStringOccurences.entrySet()){
            for(Map.Entry<Character, Integer> second : secondStringOccurences.entrySet()){
                    if(first.equals(second.getKey())){
                        if(first.getValue().equals(second.getValue())){
                            firstStringOccurences.remove(first.getKey());
                            secondStringOccurences.remove(second.getKey());

                        } else{
                            int count = first.getValue() - second.getValue();
                            if(count < 0){
                                count = count * (-1);
                            }
                            noOfCharactersToRemove = noOfCharactersToRemove + count;
                        }
                    } else{
                        noOfCharactersToRemove = noOfCharactersToRemove + second.getValue();
                        secondStringOccurences.remove(second.getKey());
                    }
            }

        }*/

    }

    private static Map<Character, Integer> convertToMap(String str){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int len = str.length();
        int noOfOccurences = 0;
        Character character = null;
        for(int i = 0; i < len; i++){
            character = str.charAt(i);
            noOfOccurences = 0;
           if(map.containsKey(character)){
               noOfOccurences =  map.get(character);
               noOfOccurences++;
               map.put(character, noOfOccurences);
            } else{
               map.put(character, 1);
           }
        }
        return  map;
    }
}
