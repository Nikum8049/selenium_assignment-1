package JavaAssingment;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Which Table You Want To Print : ");
        int num=sc.nextInt();
        System.out.println("Below is the  Number " + num + " Table :");
        //int num=5;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * " + i + " = "+ (num*i));
        }
    }
}
