import java.util.Arrays;

public class SumArray {

    public static void main(String[] args){
        int[] ar = {1, 2, 3};
        System.out.println("Sum : "+simpleArraySum(ar));
        long [] array = {100001, 2000002};
        System.out.println( Arrays.stream(array).sum());

    }

    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }
}
