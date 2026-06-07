public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int num =  n;
        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
  
        if (original == reverse) {
            System.out.println(num  + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}