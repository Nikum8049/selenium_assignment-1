package JavaAssingment;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        String username[][]={{"NikunjM","pas1"},{"NikunjK","Pas2"},{"TejasT","Pas3"}};

       for(int i=0;i<3;i++)
       {
           for(int j = 0;j<2; j++)
           {
               System.out.println(username[i][j]);
           }
       }

    }
}
