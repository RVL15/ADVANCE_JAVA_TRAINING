public class p10 {
    public static void main (String[] args)
    {
        int n = 2;
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 3 ; j >= i  ; j--)
            {
                System.out.print(j);
            }  
            System.out.println();
        }
    }
}

