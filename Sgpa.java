/**
 * Sgpa
 */
import java.util.Scanner;
class Sgpa {
    Scanner sc = new Scanner(System.in);
    int marks[]  = new int[3];
    int credits[]  = new int[3];
    int gradePoints[] = new int[3];
    
    public void enterMarks() {
        System.out.println("Enter marks and credits");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter subject " + (i+1) + "'s marks");
            marks[i] = sc.nextInt();

            System.out.println("Enter subject " + (i+1) + "'s credits");
            credits[i] = sc.nextInt();
        }
    }

    float calculateSGPA() {
        float sgpa;
        int sumOfCredits = 0;
        int numerator = 0;

        // Evaluate grade points
        for (int i = 0; i < credits.length; i++) {
            if (marks[i] >= 90) {
                gradePoints[i] = 10;
            } else if (marks[i] < 90 && marks[i] >= 80) {
                gradePoints[i] = 9;
            } else if (marks[i] < 80 && marks[i] >= 70) {
                gradePoints[i] = 8;
            } else if (marks[i] < 70 && marks[i] >= 60) {
                gradePoints[i] = 7;
            } else if (marks[i] < 60 && marks[i] >= 50) {
                gradePoints[i] = 6;
            } else if (marks[i] < 50 && marks[i] >= 40) {
                gradePoints[i] = 5;
            } else {
                gradePoints[i] = 0;
            }

            sumOfCredits += credits[i]; 
            numerator += (credits[i]*gradePoints[i]);
        }

        sgpa = (float) (numerator/sumOfCredits);
        return sgpa;
    }

    public static void main(String args[]) {
        Sgpa ob = new Sgpa();
        ob.enterMarks();
        float result = ob.calculateSGPA();
        System.out.println("The SGPA of the student is " + result);
    }
}