package JavaAssingment;

public class ConcateGivenStringEndOfAnotherString_14 {
    public static void main(String[] args) {
        String a1 = "Welcome To";
        String a2 = " Tops Technology";
        String a3 = " Enjoy Programing";
        System.out.println("Concatenate Of a1 + a2 is " + a1+a2);
        System.out.println("Using Concat key Word :-> " + a1.concat(a2));

        //3 string joining
        System.out.println("Using Concat key Word 3 string Joining :=> " + a1.concat(a2).concat(a3));
        System.out.println("Using Concat key Word + combo 3 string Joining :=> " + a1.concat(a2+a3));
    }
}
