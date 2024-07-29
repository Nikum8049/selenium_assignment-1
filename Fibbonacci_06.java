package JavaAssingment;


import java.util.Scanner;

public class Fibbonacci_06 {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter The number that you want in Fibbonacci Series :");

        int length= sc.nextInt();
        //int length =20;

        int a=0;
        int b=1;

        System.out.println("value of a is : "+ a + " Value of b is : " +b);
        for(int i=3; i<=length;i++)
        {
            int c = a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
            //0 1 1 , output
        }
    }
}
