public class p6 {
    public static void main (String[] args)
    {
        int n = 3;
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= n - i  ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 3 ; k >= n - i + 1 ; k--)
            {
                System.out.print(k);
            }
           
            System.out.println();
        }
    }
}

