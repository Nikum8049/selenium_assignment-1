package JavaAssingment;
import java.util.Scanner;

public class UserInputMarksDisplayGrades_26
{
    public static void main(String[] args)
    {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your marks (out of 100): ");
                int marks = scanner.nextInt();


                if (marks < 0 || marks > 100)
                {
                    System.out.println("Invalid input. Marks should be between 0 and 100.");
                }
                else
                {
                    String grade = determineGrade(marks);
                    System.out.println("Your grade is: " + grade);
                }
                scanner.close();
            }

            public static String determineGrade(int marks) {
                if (marks >= 91) {
                    return "AA";
                } else if (marks >= 81) {
                    return "AB";
                } else if (marks >= 71) {
                    return "BB";
                } else if (marks >= 61) {
                    return "BC";
                } else if (marks >= 51) {
                    return "CD";
                } else if (marks >= 41) {
                    return "DD";
                } else {
                    return "Fail";
                }
            }


    }
