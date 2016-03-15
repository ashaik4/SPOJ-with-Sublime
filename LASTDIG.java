
import java.util.Scanner;

/**
 * Created by arshadshaik on 3/14/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b ==0){
                System.out.println(1);
            }
            else {
                int mod = b % 4;
                if (mod == 0)
                    mod = 4;

                double result = Math.pow(a, mod) % 10;

                System.out.println((int) result);
            }
        }
    }
}