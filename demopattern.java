package JavaAssingment;

public class demopattern {
    public static void main(String[] args) {
        //i+j

/*for(int j=1;j<=5;j++)
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.print("*");
        }
            System.out.println();
        }*/

       /* for(int j=1;j<=5;j++)
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for(int j=1;j<=5;j++)
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*int lines =7;
        for(int j=1;j<=lines;j++)
        {
            for (int i = 1; i <= lines; i++)
            {
                System.out.print("");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/
                int lines=5;
        for(int i=0;i<lines;i++)
        {
                //to print space
            for(int j=lines-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {

                System.out.print(" *");

            }
            System.out.println("");
        }

    }
}
