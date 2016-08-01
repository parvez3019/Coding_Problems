package patterns;

/**
 * Created by parvez on 31/7/16.
 */


public class Pattern_9 {

    public static void printNumberPattern(int n)
    {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0 ; j <= 2*i  ;j++)
            {
                System.out.print( j <= i ? i+j+1 +"\t" : j+1 + "\t");
            }

            System.out.println();
        }

    }

    public static void main(String[] args)
    {
       printNumberPattern(4);
    }
}
