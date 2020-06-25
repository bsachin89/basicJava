public class CountingValleys {

    public static void main(String[] args){
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
       int len = s.length();
       int noOfVallies = 0;
       int sum = 0;
       for (int i = 0; i < len; i++){
            if(s.charAt(i) == 'U'){
                sum++;
            } else if(s.charAt(i) == 'D'){
                sum-- ;
            }

            if(sum == 0){
                noOfVallies ++;
            }
       }
        return noOfVallies;
    }
}
