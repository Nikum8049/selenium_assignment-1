package JavaAssingment;

import java.util.Scanner;

public class PrintPattern_04 {
    public static void main(String[] args) {
        /* w.a.p. to print pattern
                1
               2 2
              3 3 3
             4  4 4 4
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter The number that you want to print :");
        int n= sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
