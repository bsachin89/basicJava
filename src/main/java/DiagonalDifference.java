import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args){
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(8);
        list3.add(9);

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int len = arr.size();
        int leftCounter = 0;
        int rightCounter = arr.get(0).size() - 1;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i< len; i++){
            System.out.println("Counters : "+leftCounter+"\t "+rightCounter);
            List<Integer> list = arr.get(i);
            System.out.println("Elements : "+list.get(leftCounter)+"\t "+list.get(rightCounter));
            leftDiagonalSum += list.get(leftCounter);
            leftCounter++;
            rightDiagonalSum += list.get(rightCounter);
            rightCounter--;
        }
        System.out.println("****");
        System.out.println(leftDiagonalSum+"\t "+rightDiagonalSum);
        int diff = leftDiagonalSum - rightDiagonalSum;
        return Math.abs(diff);

    }
}
