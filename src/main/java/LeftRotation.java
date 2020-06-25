import java.util.*;

public class LeftRotation {

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Before Array ");
        printArray(a);

        System.out.println("\nAfter Array ");

        printArray(rotLeft(a,4));
    }

    private static void printArray(int[] a){
        int len = a.length;
        for (int i =0; i < len; i++){
            System.out.print(a[i]+"\t");
        }

    }
    private static int[] rotLeft(final int[] array, int d) {
        int lenthOfArray = array.length;
        int[] arrayCopy = new int[lenthOfArray];
        int modifiedIndex = 0;
      /*  if(d > lenthOfArray){
            d = d - lenthOfArray;
        }*/
        for(int i = 0; i < lenthOfArray; i++){
            modifiedIndex = i - d;
            if(modifiedIndex < 0){
                modifiedIndex = lenthOfArray + modifiedIndex;
            }
         //  System.out.println("\ni = "+i+" modifiedIndex = "+modifiedIndex);
            arrayCopy[modifiedIndex] = array[i];
        //    printArray(arrayCopy);
        }
        //System.out.println("****");
        return arrayCopy;
    }

}
