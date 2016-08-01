package patterns;

/**
 * Created by parvez on 30/7/16.
 */
//E
//DE
//CDE
//BCDE
//ABCDE


public class Pattern_5 {

    public static void print(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for( int j = 0 ;  j <= i; j++)
            {
                System.out.print((char)('A'+ n -i + j -1 ));
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        print(5);
    }
}
