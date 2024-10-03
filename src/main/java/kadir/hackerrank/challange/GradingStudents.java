package kadir.hackerrank.challange;

import java.util.*;

class Grading {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static int getNextMultiple5Distance( int i){
        int reminder = i % 5;
        int distance = 5 - reminder;
        return distance;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        int nextMultiple5distance;
        for( int i = 0; i < grades.size(); i++){
            int grade = grades.get(i);
            nextMultiple5distance = getNextMultiple5Distance(grades.get(i));

            if(nextMultiple5distance < 3){
                grade = grade + nextMultiple5distance;
                if(grade <40){
                    grade = grade - nextMultiple5distance;
                }
                grades.set(i, grade);
            }
        }
        return grades;
    }
}