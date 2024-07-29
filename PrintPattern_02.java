package JavaAssingment;

public class PrintPattern_02 {
    public static void main(String[] args) {
        /* 01 Print the pattern
        1
        12
        123
        1234
        12345*/

     /*   for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }*/

        /* 02 Print Pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         */

      /*  int lines = 5;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }*/

        /* 03s Print Pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         */

      /*  int line=5;
        int starcount=1;
        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=starcount;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            starcount++;
        }
            */
        /* 03s Print Pattern
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        /*int lines=5;
        int starcount=lines;
        for(int i=1;i<=lines;i++)
        {
            for (int j = 1; j <= starcount; j++)
            {
                System.out.print("*");

            }
            System.out.println();
            starcount--;
        }*/

        /* 03s Print Pattern
         *
       * *
     * * *
   * * * *
 * * * * *
         */
/*
        int line=5;
        int starcount = 1;
        int spacecount = line-1;

        for(int i=1; i<=line;i++)
        {
            for(int j=1; j<=spacecount;j++)
            {
                System.out.print(" "); // put space in bracket then its right alingment
            }
            for (int k=1;k<=starcount;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            starcount++;
            spacecount--;
        }*/

        /*
          *
         * *
        * * *
       * * * *
      * * * * *

         */

/*
        int line=5;
        int starcount = 1;
        int spacecount = line-1;

        for(int i=1; i<=line;i++)
        {
            for(int j=1; j<=spacecount;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=starcount;k++)
            {
                System.out.print(" *"); // if u put space before * then it draw triangle
            }
            System.out.println("");
            starcount++;
            spacecount--;
        }*/

        /* 03s Print Pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        int line = 5;
        int starcount = 1;
        int spacecount = line - 1;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= spacecount; j++) {
                System.out.print(""); // put space in bracket then its right alingment
            }
            for (int k = 1; k <= starcount; k++) {
                System.out.print("*");
            }
            System.out.println();
            starcount++;
            spacecount--;
        }
    }
}
