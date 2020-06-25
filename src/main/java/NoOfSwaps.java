import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NoOfSwaps {

    public static int noOfSwaps = 0;
    public static void main(String[] args){

        int[] arr = {4, 3, 1, 2, 5};
        System.out.println("Original array is : ");
        printArray(arr);
        mergeSort(arr);
        System.out.println("\nNumber of swaps : "+noOfSwaps);
        //System.out.println("\nNumber of swaps : "+minimumSwaps(arr));

    }

    public static void printArray(int[] arr){

        IntStream stream = Arrays.stream(arr);
        Arrays.stream(arr).forEach( no -> System.out.print(no+"\t"));

    }



    static int minimumSwaps(int[] arr) {

        // int[] sortedArray = Arrays.stream(arr).sorted().toArray();

        int len = arr.length;
        int temp;
        int noOfSwaps = 0;
        for(int i = 0; i < len; i++ ){
                for(int j = 1; j < (len - i); j++){
                    if(arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        noOfSwaps++;
                    }
                }
        }
        System.out.println("\nSorted Array is: ");
        printArray(arr);
        return noOfSwaps;
    }


    public static void mergeSort(int[] array){


        /*
        * if array is null, then return
         */

        if(array == null){
            return;
        }
        /*
        * Calculate mid and create 2 sub-arrays and then call it recursively
        * till array of size 1
        *
         */
        if(array.length > 1){
            int len = array.length;
            int mid = len / 2;

            int [] left = new int[mid];
            for (int i =0; i < mid; i++){
                left[i] =  array[i];
            }

            System.out.println("\n Left Array : \n");
            printArray(left);

            int[] right = new int[len - mid];
            int limit = len - mid;
            for(int i = 0; i < limit; i++ ){
                right[i] = array[mid+i];
            }

            System.out.println("\n Right Array : \n");
            printArray(right);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;

            System.out.println("\n ******* \n");

            while( i < left.length && j < right.length){
                    if(left[i] < right[j]){
                        array[k] = left[i];
                        i++;
                        noOfSwaps++;
                    } else{
                        array[k] = right[j];
                        j++;
                        noOfSwaps++;
                    }
                    k++;
                System.out.println("\n Array : \n");
                printArray(array);
            }
            while( i < left.length){
                array[k] = left[i];
                k++;
                i++;
            }
            while( j < right.length){
                array[k] = right[j];
                k++;
                j++;
            }
            System.out.println("\n Final Array : \n");
            printArray(array);
        }


    }

}
