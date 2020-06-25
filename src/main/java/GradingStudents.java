import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static void main(String[] args){
        System.out.println("Grades : "+gradingStudents(Arrays.asList(73,67,38,33)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        /*List<Integer> updatedGrades = new ArrayList<>();
        int len = grades.size();
        int grade = 0;


        for (int i = 0; i < len; i++){
            grade = grades.get(i);
            if(grade > 37){
                int reminder = grade % 5;
                int division = grade / 5;
                if(reminder > 2){
                    division++;
                    grade = division * 5;
                }
            }
            updatedGrades.add(grade);
        }
        return updatedGrades;*/


        return grades.stream().map(
                grade -> {
                    if(grade > 37){
                        int reminder = grade % 5;
                        int division = grade / 5;
                        if(reminder > 2){
                            division++;
                            grade = division * 5;
                        }
                    } return  grade;
                } ).collect(Collectors.toList());
    }
}
