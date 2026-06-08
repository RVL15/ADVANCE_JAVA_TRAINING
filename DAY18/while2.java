public class while2 {
    public static void main (String[] args)
    {
        int x = 1;
        while(x < 6) {
            
            if(x == 3)
            {
                System.out.println(4);
                x++;
                x++;
                continue;
            }
           System.out.println(x);
           x++;
        }
        
    }
}

