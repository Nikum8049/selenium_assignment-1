package JavaAssingment;

import java.util.Scanner;

public class ThreeNumberFromUser_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Number To Find Greatest From Them : ");
        System.out.println("Please Enter Number a : ");
        int a = sc.nextInt();
        System.out.println("Please Enter Number b :");
        int b = sc.nextInt();
        System.out.println("Please Enter Number c :");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Greatest Number is a = " +a );
        }
        else if (b>a && b>c) {

            System.out.println("Greatest Number is b = " +b);
        }
        else if (c>a && c>b)
        {
            System.out.println("Greatest Number is c = " +c);
        }
    }
}
