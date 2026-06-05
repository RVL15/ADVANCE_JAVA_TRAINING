public class p11 {
    public static void main (String[] args)
    {
        int n = 3;
        for (int i = 0; i <= n-1; i++)
        {
            for (int j = n; j > i  ; j--)
            {
                System.out.print(j-i);
            }  
            System.out.println();
        }
    }
}

