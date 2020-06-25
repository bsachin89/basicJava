import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTriplets {

    public static void main(String [] args){
        System.out.println(compareTriplets(Arrays.asList(17,28,30), Arrays.asList(99,16,8)));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int[] array = new int[2];
        for(int i = 0; i< 3; i++){
            if(a.get(i).compareTo(b.get(i)) == 1){
                array[0]++;
            } else if(a.get(i).compareTo(b.get(i)) == -1){
                array[1]++;
            }
        }
        return Arrays.asList(array[0], array[1]);

    }
}
