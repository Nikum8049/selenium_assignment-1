package JavaAssingment;

public class FactorialOfGivenNumber_03 {
    public static void main(String[] args) {
        //multiplication basic=1, sum basic=0;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter The Number To Find Factorial of it's : ");
//        int number = sc.nextInt();
//        int i, fact=1;
//        for(i=1;i<=number;i++)
//        {
//            fact = fact*i;
//        }
//        System.out.println("Factorial Of Number " + number + " is : " +fact);


        //Using For Loop Factorial//

//        int num =10;
//        int fact = 1;
//        for(int i=1; i<=num; i++)
//        {
//            fact = fact * i;  //fact*=i;
//        }
//        System.out.println("Fact is : " + fact);

        // Using While loop Factorial//

        int num=5;
        int i=1;
        int fact=1;
        while(i<=num)
        {

            fact = fact *i;
            i++;
        }
        System.out.println("Fact is : " + fact);
    }
}
