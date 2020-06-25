import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {

    public static void main(String[] args){

        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        System.out.println(getMoneySpent(keyboards, drives, 60));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        /*int amount = 0;
        List<Integer> result = new ArrayList<>();

        if(keyboards != null && keyboards.length > 0 && drives != null && drives.length > 0){
            Arrays.sort(keyboards);
            Arrays.sort(drives);
            int len1 = keyboards.length;
            int len2 = drives.length;
            for (int i = (len1 - 1); i >= 0; i--) {
                for (int j = (len2 - 1); j >= 0 ; j--) {
                    amount =  keyboards[i] + drives[j];
                    if(amount <= b){
                        result.add(amount);
                    }
                }
            }
            if (result != null && !result.isEmpty()){
                Collections.sort(result);
                return result.get((result.size() - 1));
            } else{
                return -1;
            }
        }
        return  -1;*/

        int amount = 0;
        List<Integer> result = new ArrayList<>();

        if(keyboards != null && keyboards.length > 0 && drives != null && drives.length > 0){
            Arrays.sort(keyboards);
            Arrays.sort(drives);
            int len1 = keyboards.length;
            int len2 = drives.length;

            for (int i = (len1 - 1); i >= 0; i--) {
                for (int j = (len2 - 1); j >= 0 ; j--) {
                    amount =  keyboards[i] + drives[j];
                    if(amount <= b){
                        result.add(amount);
                    }
                }
            }
            if (result != null && !result.isEmpty()){
                Collections.sort(result);
                return result.get((result.size() - 1));
            } else{
                return -1;
            }
        }
        return  -1;
    }
}
