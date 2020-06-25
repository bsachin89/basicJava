public class BubbleSort {

    public static void main(String[] args){
        int[] a = {6, 4, 1};
        countSwaps(a);
    }

    static void countSwaps(int[] a) {
        int len = a.length;
        int temp = 0;
        int noOfSwaps = 0;
        for(int i = 0; i < len; i++){
            for (int j = 1; j < (len - i); j++){
                if(a[j-1] > a[j]){
                    temp = a[ j ];
                    a[ j ] = a[ j - 1 ];
                    a[j - 1] = temp;
                    noOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+noOfSwaps +" swaps.");
        System.out.println("First Element:  "+a[0]);
        System.out.println(" Last Element:  "+a[len-1]);




    }
}
