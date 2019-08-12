import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = enterGrades(scanner);
        printGradeDistribution(grades);
        double acceptance = acceptance(grades);
        System.out.print(acceptance);
        System.out.println();
    }
    
    public static int[] enterGrades(Scanner scanner) {
        int grade = 0;
        int[] grades = new int[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 0;
        }
        
        System.out.println("Type exam scores, -1 completes:");
        while (grade != -1) {
            grade = Integer.parseInt(scanner.nextLine());
            if (grade >= 0 && grade <= 60) {
                //assign to grades to update? or just call method?
                grades = catergorizeGrade(grade, grades);
            }        
        }

        return grades;
    }
    
    public static int[] catergorizeGrade(int grade, int[] grades) {  
         if (grade >= 0 && grade <= 29) {
                grades[0]++;
            } else if (grade >= 30 && grade <= 34) {
                grades[1]++;
            } else if (grade >= 35 && grade <= 39) {
                grades[2]++;
            } else if (grade >= 40 && grade <= 44) {
                grades[3]++;
            } else if (grade >= 45 && grade <= 49) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        
        return grades;
    }
  
    public static void printGradeDistribution(int[] grades) {
        System.out.println("Grade distribution:");
        for (int i = (grades.length - 1); i >= 0; i--) {
            System.out.print(i+": ");
            for (int k = 0; k < grades[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static double acceptance(int[] grades) {
        System.out.print("Acceptance percentage: ");
        
        int accepted = 0;
        for (int i = 1; i < grades.length; i++) {
            //Failed grades e.g. grade0 is not included
            accepted += grades[i];
        }
        if (accepted == 0) {
                return 0;
            }
        
        int allScores = 0;
        for (int i = 0; i < grades.length; i++) {
            allScores += grades[i];
        }
        
        return 100*accepted / (double) allScores; 
        
    }
    
}
