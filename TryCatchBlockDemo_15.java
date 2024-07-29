package JavaAssingment;

import java.util.Scanner;

class InvalidAgeForVotingException extends Exception
{

}

class ValidationAge
{
    public void checkAge(int age) throws InvalidAgeForVotingException
    {
        if(age>18)
        {
            System.out.println("Voter is eligible for voting : ");
        }
        else
        {
            System.out.println("Voter is not eligible for voting :");
        }
    }
}
public class TryCatchBlockDemo_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your age to check whether you are eligible for voting or not :");
        int age = sc.nextInt();;

        ValidationAge va = new ValidationAge();
        try {
            va.checkAge(18);
        } catch (InvalidAgeForVotingException e) {
            throw new RuntimeException(e);
        }
    }
}
