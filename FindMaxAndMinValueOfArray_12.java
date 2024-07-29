package JavaAssingment;

public class FindMaxAndMinValueOfArray_12 {
    public static void main(String[] args) {
        //Find Max and Min Value Of An Array

//        int arr[] = {11,12,45,66,78,3,225,2};
//       int max=arr[0];
//       for(int i=1;i<arr.length;i++)
//       {
//           if(arr[i]>max)
//           {
//               max=arr[i];
//           }
//       }
//        System.out.println("Maximum Value Of An Array is "+ max);

       int a[] = {45,3,78,48,11};
       int min=a[0];
       for(int j=1;j<a.length;j++)
       {
           if(a[j]<min)
           {
               min=a[j];
           }

       }
        System.out.println("Minimum Value of An Array is " + min);
    }
}
