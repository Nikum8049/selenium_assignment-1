package JavaAssingment;

public class PrintPattern_03 {
    public static void main(String[] args) {
        /* Print pattern
        1
        01
        101
        01010
        101010*/
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(j%2==1)
                        {
                            System.out.print("1 ");
                        }
                        else
                        {
                            System.out.print("0 ");
                        }
                    }
                    System.out.println(" ");
                }

    }
}
