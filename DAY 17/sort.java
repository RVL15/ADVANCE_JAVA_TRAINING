
public class sort{
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 5) {
                    System.out.println(i);
                    break;
                }
                num = num / 10;
            }
        }
    }

}
