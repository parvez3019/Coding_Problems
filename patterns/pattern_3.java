package patterns;

/**
 * Created by parvez on 28/7/16.
 */

//https://qph.ec.quoracdn.net/main-qimg-1bd9f136e0fd861ebca4bfbcbba787d1-c?convert_to_webp=true
//    Pascal diamond

public class pattern_3 {

        public static void print(int n) {
            for (int i = 0; i < n; i++) {
                for(int j = 0 ; j < n-i-1 ; j++)
                {
                    System.out.print("\t");
                }
                for (int j = 0; j<= i ; j++) {
                    System.out.print(pascal(i, j) + "\t\t");
                }
                System.out.println();
            }
            for (int i = 0 ; i < n-1 ; i++)
            {
                for(int j = 0 ; j <= i ; j++)
                {
                    System.out.print("\t");
                }
                for(int j = 0 ; j < n - i - 1;j++)
                {
                    System.out.print(pascal(n - i - 2, j) + "\t\t");
                }
                System.out.println();
            }
        }

        public static int pascal(int i, int j) {
            if (j == 0) {
                return 1;
            } else if (j == i) {
                return 1;
            } else {
                return pascal(i - 1, j - 1) + pascal(i - 1, j);
            }
        }



    public static void print_pattern(int n )
    {

        for (int i = 0 ; i < n ; i++)
        {
            int num = 1;
            for(int j = 0 ; j <= Math.abs(n-1-i) ; j++)
            {
                System.out.print("\t");
            }
            for(int j = 0 ; j < (n - Math.abs(n-1-i))  ;j++)
            {
                System.out.print(num +"\t\t");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

        for (int i = n ; i < 2*n-1 ; i++)
        {
            int num = 1;
            for(int j = 0 ; j <= Math.abs(n-1-i) ; j++)
            {
                System.out.print("\t");
            }
            for(int j = 0 ; j < (n - Math.abs(n-1-i))  ;j++)
            {
                System.out.print(num +"\t\t");
                num = num * Math.abs(n - i)/(j - i);
            }
            System.out.println();
        }



    }


    public static void main(String[] args)
    {
//        print_pattern(5);
        print(5);
    }

}
