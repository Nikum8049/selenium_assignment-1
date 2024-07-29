package JavaAssingment;

import java.util.Scanner;

public class UserInputFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Number That you want to find for factorial : " );
        int num2= sc.nextInt();
        int fact=1;
        for(int i=1;i<=num2;i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial Of The Given Number is : " +fact);

    }
}
