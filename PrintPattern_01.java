package JavaAssingment;

public class PrintPattern_01 {
    public static void main(String[] args) {
        /*Print Patterm
         *****
         *****
         *****
         *****
         *****
         */
        /*
        int lines = 7;
        for(int j=1;j<=lines;j++)
        {
            for(int i=1;i<=lines;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*
        11111
        22222
        33333
        44444
        55555*/
        int lines = 5;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=lines;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        /*Print Pattern
        12345
        12345
        12345
        12345
        12345
        * */

       /* int lines = 5;
        for (int i = 1; i <= lines; i++)
        {
            for (int j = 1; j <= lines; j++)
            {
                System.out.print(j); //Print j so u get 12345 in output
            }
          System.out.println();
        }*/
    }
}
