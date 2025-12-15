import java.util.Scanner;
public class EvenOddMixed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0, odd = 0;

        while (num > 0) {
            if ((num % 10) % 2 == 0)
                even++;
            else
                odd++;
            num /= 10;
        }

        if (even > 0 && odd > 0)
            System.out.println("Mixed");
        else if (even > 0)
            System.out.println("All Even");
        else
            System.out.println("All Odd");
    }
}
