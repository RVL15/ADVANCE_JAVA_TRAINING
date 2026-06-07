public class prime {
    public static void main(String [] args )
    {
        int n =8;
        boolean isPrime = true;
        for (int i = 2; i< n; i++)
        {
            if (n%i == 0 )
            {
                isPrime = false;
                break;
            }
            
        }
        System.out.println(isPrime ? n + " is a prime number" : n + " is not a prime number");
    }
    
}
