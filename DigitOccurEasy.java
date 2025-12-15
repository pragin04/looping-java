import java.util.Scanner;
public class DigitOccurEasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int digit =sc.nextInt();

        while (num > 0) {
            if (num % 10 == digit) {
                System.out.println("Digit occurred");
                return;
            }
            num = num / 10;
        }

        System.out.println("Digit not occurred");
    }
}
