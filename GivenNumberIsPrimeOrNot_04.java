package JavaAssingment;

public class GivenNumberIsPrimeOrNot_04
{
    public static void main(String[] args)
    {
//        Scanner sc= new Scanner(System.in);//
//        System.out.println("Please Enter The Number To Find That It's Prime Or Not : ");
//        boolean flag=false;
//        int number= sc.nextInt();
//        for(int i=2; i<=number/2;++i)
//        {
//            if (number % i == 0)
//            {
//                flag = true;
//                break;
//            }
//        }
//           if(!flag)
//           {
//               System.out.println(number + " Is a Prime Number .");
//           }
//           else
//           {
//               System.out.println(number + " Is  Not a Prime Number .");
//           }
//        }
//
        //find prime number between 1-100
        for(int a=3;a<=100;a++)
        {

        int num=a;
        int flag=0;
        for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+ " : Is Prime");
        }
        else
        {
            System.out.println(num + " : Is Not Prime");
        }
        }
    }
    }


