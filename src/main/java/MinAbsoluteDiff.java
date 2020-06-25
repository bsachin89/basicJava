import java.util.*;

public class MinAbsoluteDiff {
    public static void main(String[] args){
        int[] arr = {1, -3, 71, 68, 17};
        System.out.println("Minimum Absolute Difference is "+minimumAbsoluteDifference(arr));

    }

    static int minimumAbsoluteDifference(int[] arr) {


        // Normal approach taking more time
        /*
        int len = arr.length;
        Set<Integer> absoluteDifference = new TreeSet<>();
        int temp = 0;
        for (int i = 0; i < (len - 1); i++){
            for (int j = (i + 1); j < len; j++){
                temp = arr[i] - arr[j];
                if(temp < 0){
                    temp = temp * (-1);
                }
                absoluteDifference.add(temp);
            }
        }
        return ((TreeSet<Integer>) absoluteDifference).first();*/

        int len = arr.length;
        Arrays.sort(arr);
        int [] absoluteDiff = new int[ len - 1];

        for(int i = 0; i < (len-1); i++){
            absoluteDiff [i] = Math.abs(arr[i] - arr[i+1]);
        }

        Arrays.sort(absoluteDiff);
        return absoluteDiff[0];

    }
}
